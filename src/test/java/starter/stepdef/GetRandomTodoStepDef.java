package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.TodosAPI;

public class GetRandomTodoStepDef {

    @Steps
    TodosAPI todosAPI;

    @Given("Get a random todo with valid parameter")
    public void getARandomTodoWithValidParameter() {
        todosAPI.getARandomTodo();
    }

    @When("Send request get a random todo")
    public void sendRequestGetARandomTodo() {
        SerenityRest.when().get(TodosAPI.GET_A_RANDOM_TODO);
    }


    @Given("Get a random todo with invalid parameter")
    public void getARandomTodoWithInvalidParameter() {
        todosAPI.getARandomTodo();
    }
}
