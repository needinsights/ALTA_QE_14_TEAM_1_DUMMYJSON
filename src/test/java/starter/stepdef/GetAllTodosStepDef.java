package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.TodosAPI;

public class GetAllTodosStepDef {

    @Steps
    TodosAPI todosAPI;

    @Given("Get list all todos")
    public void getListAllTodos() {
        todosAPI.getAllTodos();
    }

    @When("Send request get list todos")
    public void sendRequestGetListTodos() {
        SerenityRest.when().get(TodosAPI.GET_ALL_TODOS);
    }
}
