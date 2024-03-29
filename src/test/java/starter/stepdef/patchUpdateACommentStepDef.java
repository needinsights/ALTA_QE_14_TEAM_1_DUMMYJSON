package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import jnr.constants.Constant;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CommentsAPI;
import starter.utils.Constants;

import java.io.File;

public class patchUpdateACommentStepDef {
    @Steps
    CommentsAPI commentsAPI;
    @Given("Patch update a comment with valid json {string}")
    public void patchUpdateACommentWithValidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        commentsAPI.patchUpdateAComment(jsonFile);
    }
    @When("Send request to patch update a comment")
    public void sendRequestToPatchUpdateComments() {
        SerenityRest.when()
                .patch(CommentsAPI.PATCH_UPDATE_A_COMMENT);
    }

}
