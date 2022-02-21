package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.Signin;

public class signinSteps {

    @Steps
    Signin signin;


    @Given("I am test api signin")
    public void iAmTestApiSignin() {
    }

    @When("I am enter phone number and password")
    public void iAmEnterPhoneNumberAndPassword() {signin.setBodyReq();
    }

    @When("I Click execution button")
    public void iClickExecutionButton() {signin.hitEndpointSignin();
    }

    @Then("Api signin success")
    public void apiSigninSuccess() {signin.valDateEndpointSignin();
    }
}
