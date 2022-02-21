package starter.account.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.endpoint.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Register {

    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;

    @Step
    public void setBodyReq() {
        requestParams = new JSONObject();
        requestParams.put("phone", "081211112222"+endpoint.angka);
        requestParams.put("password", "andi11");
        requestParams.put("country", "indonesia");
        requestParams.put("latlong", "1");
        requestParams.put("device_token", "1");
        requestParams.put("device_type", "0");

    }

    @Step
    public void hitEndpointRegist()
    {
        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(requestParams.toString())
                .when()
                .post(endpoint.register)
                .then()
                .statusCode(201);
    }

    @Step
    public void valDateEndpointRegist() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/register.json"));
    }

}
