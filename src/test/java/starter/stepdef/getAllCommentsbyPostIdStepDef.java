package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.restassured.mapper.ObjectMapper;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CommentsAPI;
import starter.dummyjson.CommentsResponse;

import static org.hamcrest.Matchers.equalTo;

public class getAllCommentsbyPostIdStepDef {
    @Steps
    CommentsAPI commentsAPI;
    @Given("Get all comments by PostId {int}")
    public void getAllCommentByPostId(int id) {
        commentsAPI.getAllCommentsByPostId(id);
    }

    @When("send request to get Comment by PostId")
    public void sendRequestToGetCommentByPostId() {
        SerenityRest.when()
                .get(CommentsAPI.GET_All_COMMENTS_POSTID);
    }
}
