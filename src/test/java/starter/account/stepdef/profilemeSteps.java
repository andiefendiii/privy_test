package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.ProfileMe;

public class profilemeSteps {

    @Steps
    ProfileMe profileme;

    @Given("I am test api profile me")
    public void iAmTestApiProfileMe() {profileme.setBodyReq();
    }

    @When("I am login for profile me")
    public void iAmLoginForProfileMe() {profileme.hitEndpointSigninUser();
    }

    @When("I am get detail profile me")
    public void iAmGetDetailProfileMe() {profileme.hitEndpointprofileMe();
    }

    @Then("Test api profile me success")
    public void testApiProfileMeSuccess() {profileme.valDateprofileMe();
    }
}
