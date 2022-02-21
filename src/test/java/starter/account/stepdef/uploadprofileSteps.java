package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.UploadProfile;

public class uploadprofileSteps {

    @Steps
    UploadProfile uploadprofile;

    @Given("I am upload image profile")
    public void iAmUploadImageProfile() {uploadprofile.setBodyReq();
    }

    @When("I am login for upload image profile")
    public void iAmLoginForUploadImageProfile() {uploadprofile.hitEndpointSigninUser();
    }

    @When("I click execution button api upload image profile")
    public void iClickExecutionButtonApiUploadImageProfile() {uploadprofile.hitEndpointUploadProfile();
    }

    @Then("Upload image profile success")
    public void uploadImageProfileSuccess() {
    }
}
