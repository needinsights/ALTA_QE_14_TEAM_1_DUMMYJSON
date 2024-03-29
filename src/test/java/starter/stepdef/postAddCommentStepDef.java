package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import starter.dummyjson.CommentsAPI;
import starter.utils.Constants;

import java.io.File;

public class postAddCommentStepDef {
    @Given("Add a comment with valid json {string}")
    public void addACommentWithValidJson(String json) {
        File jsonFIle = new File(Constants.REQ_BODY+json);
    }

    @When("Send request post add comment")
    public void sendRequestPostAddComment() {
        SerenityRest.when().post(CommentsAPI.POST_ADD_COMMENT);
    }

    // Negative
    @Given("Add a comment with invalid json {string}")
    public void addACommentWithinValidJson(String json) {
        File jsonFIle = new File(Constants.REQ_BODY+json);
    }
}
