package starter.account.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.endpoint.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ProfileEducation {

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
    public void hitEndpointProfileEducation() {
        SerenityRest
                .given()
                .header("Accept", "application/json")
                .header("Authorization", "Bearer "+access_token)
                .header("Content-Type","multipart/form-data")
                .multiPart("school_name","Universitas Hahahihi")
                .multiPart("graduation_time","02-02-2022")
                .when()
                .post(endpoint.education)
                .then()
                .statusCode(201);
    }

    @Step
    public void valDateEndpointProfileEducation() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/profileeducation.json"));
    }

}
