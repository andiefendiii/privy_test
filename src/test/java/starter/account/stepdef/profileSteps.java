package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.Profile;

public class profileSteps {

    @Steps
    Profile profile;

    @Given("I am test api pofile")
    public void iAmTestApiPofile() {profile.setBodyReq();
    }

    @When("I am login for profile")
    public void iAmLoginForProfile() {profile.hitEndpointSigninUser();
    }

    @When("I am input profile")
    public void iAmInputProfile() {profile.hitEndpointProfile();
    }

    @Then("test api profile success")
    public void testApiProfileSuccess() {profile.valDateEndpointProfile();
    }
}
