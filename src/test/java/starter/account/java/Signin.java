package starter.account.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.endpoint.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Signin {

    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;


    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("phone", "6285163230188");
        requestParams.put("password", "andi1");
        requestParams.put("latlong", "1");
        requestParams.put("device_token", "1");
        requestParams.put("device_type", "2");

    }

    @Step
    public void hitEndpointSignin()
    {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.signin)
                .then()
                .statusCode(201);
    }

    @Step
    public void valDateEndpointSignin() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/login.json"));
    }
}
