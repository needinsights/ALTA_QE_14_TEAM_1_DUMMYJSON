package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.TodosAPI;

public class getLimitAndSkipTodosStepDef {

    @Steps
    TodosAPI todosAPI;

    @Given("Get limit and skip todos with valid parameter limit {int} and skip {int}")
    public void getLimitAndSkipTodosWithValidParameterLimitAndSkip(int limit, int skip) {
        todosAPI.getLimitAndSkip(limit, skip);
    }

    @When("Send request get skip todo")
    public void sendRequestGetSkipTodo() {
        SerenityRest.when().get(TodosAPI.LIMIT_AND_SKIP_TODO);
    }
}
