package starter.account.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.endpoint.Endpoint;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class MessagePost {

    Endpoint endpoint = new Endpoint();
    JSONObject requestParams;
    String access_token;
    String id ;

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
    public void hitEndpointSignininUser() {
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

        id = SerenityRest
                .then()
                .extract()
                .path("data.user.id");

    }

    @Step
    public void hitEndpointMesaagePost() {
        SerenityRest
                .given()
                .header("Accept", "application/json")
                .header("Authorization", "Bearer "+access_token)
                .header("Content-Type","multipart/form-data")
                .multiPart("user_id",""+id)
                .multiPart("message","Hallo Privy")

                .when()
                .post(endpoint.messagePost)
                .then()
                .statusCode(201);
    }

    @Step
    public void valDateEndpointMessagePost() {
        SerenityRest
                .then()
                .body(matchesJsonSchemaInClasspath("JSONSchema/messagepost.json"));
    }
}
