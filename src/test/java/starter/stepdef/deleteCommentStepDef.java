package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CommentsAPI;

public class deleteCommentStepDef {

    @Steps
    CommentsAPI commentsAPI;

    @Given("Delete Comment with valid id {int}")
    public void deleteComment(int id) {
        commentsAPI.deleteComment(id);
    }

    @When("Send request to delete comment")
    public void sendRequestToDeleteComment() {
        SerenityRest.when().delete(CommentsAPI.DELETE_COMMENT);
    }
}
