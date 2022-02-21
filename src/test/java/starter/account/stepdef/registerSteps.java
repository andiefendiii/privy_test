package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.Register;

public class registerSteps {

    @Steps
    Register register;

    @Given("I am test api register")
    public void iAmTestApiRegister() {
    }

    @When("I input phone number")
    public void iInputPhoneNumber() { register.setBodyReq();
    }

    @When("I click button")
    public void iClickButton() { register.hitEndpointRegist();
    }

    @Then("I success register")
    public void iSuccessRegister() {register.valDateEndpointRegist();
    }
}
