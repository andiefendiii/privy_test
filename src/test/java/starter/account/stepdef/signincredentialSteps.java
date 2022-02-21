package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.SigninCredential;

public class signincredentialSteps {

    @Steps
    SigninCredential signincredential;

    @Given("I am test api get")
    public void iAmTestApiGet() {signincredential.setBodyReq();
    }

    @When("I am login")
    public void iAmLogin() {signincredential.hitEndpointSigninUser();
    }

    @When("I click Button")
    public void iClickButton() {signincredential.hitEndpointSigninCredential();
    }

    @Then("Api get success")
    public void apiGetSuccess() {
    }
}
