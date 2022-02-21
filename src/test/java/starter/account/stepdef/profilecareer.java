package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.ProfileCareer;

public class profilecareer {

    @Steps
    ProfileCareer profilecareer;

    @Given("I am test api profile career")
    public void iAmTestApiProfileCareer() {profilecareer.setBodyReq();
    }

    @When("I am login for profile career")
    public void iAmLoginForProfileCareer() {profilecareer.hitEndpointSigininUser();
    }

    @When("I am input career")
    public void iAmInputCareer() {profilecareer.hitEndpointProfileCareer();
    }

    @Then("Test api profile career success")
    public void testApiProfileCareerSuccess() {profilecareer.valDateEndpointProfileCareer();
    }
}
