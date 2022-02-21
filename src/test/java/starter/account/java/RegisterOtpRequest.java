package starter.account.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.endpoint.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class RegisterOtpRequest {

    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("phone", "6285163230188");

    }

    @Step
    public void hitEndpointRegisterOtpRequest()
    {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.otpRequest)
                .then()
                .statusCode(201);
    }
    @Step
    public void valDateEndpointRegisterOtpRequest() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/registerotprequest2.json"));
    }
}
