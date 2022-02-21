package starter.account.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.endpoint.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class RegisterOtpMatch {

    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String id;

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("phone", "6285163230188");

    }

    @Step
    public void hitEndpointOtpMatch()
    {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.otpMatch)
                .then()
                .statusCode(201);

        id = SerenityRest
                .then()
                .extract()
                .path("data.user.id");
    }

    @Step
    public void hitEndpointRegisterOtpMatch() {
        SerenityRest
                .given()
                .header("Accept", "application/json")
                .header("Content-Type","multipart/form-data")
                .multiPart("user_id",""+id)
                .multiPart("otp_code","8368")
                .when()
                .post(endpoint.otpMatch)
                .then()
                .statusCode(201);

    }

    @Step
    public void valDateEndpointRegisterOtpMatch() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/registerotpmatch.json"));
    }
}
