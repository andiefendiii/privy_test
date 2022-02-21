package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.RegisterOtpMatch;

public class otpmatchSteps {

    @Steps
    RegisterOtpMatch registerotpmatch;

    @Given("I am otp match")
    public void iAmOtpMatch() {registerotpmatch.setBodyReq();
    }

    @When("I am input otp")
    public void iAmInputOtp() {registerotpmatch.hitEndpointOtpMatch();
    }

    @When("I click Execution button")
    public void iClickExecutionButton() {registerotpmatch.hitEndpointRegisterOtpMatch();
    }
    @Then("Otp matching")
    public void otpMatching() {registerotpmatch.valDateEndpointRegisterOtpMatch();
    }



}
