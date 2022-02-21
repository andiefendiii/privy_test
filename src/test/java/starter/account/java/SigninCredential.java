package starter.account.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.endpoint.Endpoint;

public class SigninCredential {

    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String access_token;

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("phone", "6285163230188");
        requestParams.put("password", "andi1");
        requestParams.put("latlong", "1");
        requestParams.put("device_token","1");
        requestParams.put("device_type","2");
    }

    @Step
    public void hitEndpointSigninUser() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.signin)
                .then()
                .statusCode(201);

        access_token = SerenityRest
                .then()
                .extract()
                .path("data.user.access_token");

    }

    @Step
    public void hitEndpointSigninCredential() {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .header("Content-Type","multipart/form-data")
                .multiPart("access_token",""+access_token)
                .when()
                .get(endpoint.signinCredentials)
                .then()
                .statusCode(200);

    }
}
