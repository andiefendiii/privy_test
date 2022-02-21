package starter.account.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.java.MessagePost;

public class messagepostSteps {

    @Steps
    MessagePost messagepost;

    @Given("I am test api message post")
    public void iAmTestApiMessagePost() {messagepost.setBodyReq();
    }

    @When("I am login for test message post")
    public void iAmLoginForTestMessagePost() {messagepost.hitEndpointSignininUser();
    }

    @When("I am get api message post")
    public void iAmGetApiMessagePost() {messagepost.hitEndpointMesaagePost();
    }

    @Then("message post success")
    public void messagePostSuccess() {messagepost.valDateEndpointMessagePost();
    }
}
