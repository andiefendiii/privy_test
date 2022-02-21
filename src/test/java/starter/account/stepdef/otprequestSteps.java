package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.RegisterOtpRequest;

public class otprequestSteps {

    @Steps
    RegisterOtpRequest registerotp;

    @Given("I am test api otp request")
    public void iAmTestApiOtpRequest() {
    }

    @When("I am enter phone number register")
    public void iAmEnterPhoneNumberRegister() {registerotp.setBodyReq();
    }

    @When("I click execution button")
    public void iClickExecutionButton() {registerotp.hitEndpointRegisterOtpRequest();
    }

    @Then("Otp deliver")
    public void otpDeliver() {registerotp.valDateEndpointRegisterOtpRequest();
    }
}
