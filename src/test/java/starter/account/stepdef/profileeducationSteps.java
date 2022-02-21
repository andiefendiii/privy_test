package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.ProfileEducation;

public class profileeducationSteps {

    @Steps
    ProfileEducation profileeducation;

    @Given("I am test api profile education")
    public void iAmTestApiProfileEducation() {profileeducation.setBodyReq();
    }

    @When("I am login for profile education")
    public void iAmLoginForProfileEducation() {profileeducation.hitEndpointSigninUser();
    }

    @When("I am input education")
    public void iAmInputEducation() {profileeducation.hitEndpointProfileEducation();
    }

    @Then("Test api profile education success")
    public void testApiProfileEducationSuccess() {profileeducation.valDateEndpointProfileEducation();
    }
}
