package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CommentsAPI;

public class getSingleCommentStepDef {
    @Steps
    CommentsAPI commentsAPI;

    @Given("Get single comment with valid id {int}")
    public void getSingleCommentWithValidId(int id) {
        commentsAPI.getSingleComments(id);
    }

    @When("Send request to get single comment")
    public void sendRequestToGetSingleComment() {
        SerenityRest.when()
                .get(CommentsAPI.GET_SINGLE_COMMENTS);
    }

}
