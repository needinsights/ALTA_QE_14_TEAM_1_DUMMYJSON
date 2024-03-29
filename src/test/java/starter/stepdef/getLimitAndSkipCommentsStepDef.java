package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CommentsAPI;

public class getLimitAndSkipCommentsStepDef {
    @Steps
    CommentsAPI commentsAPI;

    @Given("Get limit and skip comments with valid parameter limit {int} and skip {int}")
    public void getLimitAndSkipCommentsWithValidParameterLimitLimitAndSkipSkip(int limit, int skip) {
        commentsAPI.getLimitAndSkip(limit, skip);
    }

    @When("Send request get skip comments")
    public void sendRequestGetSkipComments() {
        SerenityRest.when().get(CommentsAPI.GET_LIMIT_AND_SKIP_COMMENTS);
    }

    @Given("Get limit and skip comments with invalid parameter limit {int} and skip {int}")
    public void getLimitAndSkipCommentsWithInvalidParameterLimitLimitAndSkipSkip(int limit, int skip) {
        commentsAPI.getLimitAndSkip(limit, skip);
    }
}
