package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.MessageGet;

public class messagegetSteps {

    @Steps
    MessageGet messageget;

    @Given("I am test api message get")
    public void iAmTestApiMessageGet() {messageget.setBodyReq();
    }

    @When("I am login for test message get")
    public void iAmLoginForTestMessageGet() {messageget.hitEndpointSigninUser(); messageget.hitpointMessageGetID();
    }

    @When("I am get api message get")
    public void iAmGetApiMessageGet() {messageget.hitEndpointMessageGet();
    }

    @Then("message get success")
    public void messageGetSuccess() {messageget.valDateEndpointMessageGet();
    }
}
