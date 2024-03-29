package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.TodosAPI;

public class GetAllTodosByUserIdStepDef {



    @Steps
    TodosAPI todosAPI;

    @Given("Get all todos with valid user id {int}")
    public void getAllTodosWithValidUserId(int id) {
        todosAPI.setGetAllTodosByUserId(id);
    }

    @When("Send request get all todo")
    public void sendRequestGetAllTodo() {
        SerenityRest.when().get(TodosAPI.GET_ALL_TODOS_BY_USER_ID);
    }


    @Given("Get all todos with invalid user id {int}")
    public void getAllTodosWithInvalidUserId(int id) {
        todosAPI.setGetAllTodosByUserId(id);
    }
}
