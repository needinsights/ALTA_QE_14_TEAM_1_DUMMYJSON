package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CommentsAPI;

public class getAllCommentsStepDef {
    @Steps
    CommentsAPI commentsAPI;

    @Given("Get all comments with valid parameter")
    public void getAllCommentsWithValidParameter() {
        commentsAPI.getAllComments();
    }

    @When("Send request get all comments")
    public void sendRequestGetAllComments() {
        SerenityRest.when().get(CommentsAPI.GET_ALL_COMMENTS);
    }

}
