package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.TodosAPI;
import starter.utils.Constants;

import java.io.File;

public class AddNewTodoStepdefs {

    @Steps
    TodosAPI todosAPI;

    @Given("post new todo with valid json {string}")
    public void postNewTodoWithValidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY + json);
        todosAPI.addNewTodo(jsonFile);

    }


    @When("Send request post new todo")
    public void sendRequestPostNewTodo() {
        SerenityRest.when().post(TodosAPI.ADD_NEW_TODO);
    }

    @Given("post new todo with invalid json {string}")
    public void postNewTodoWithInvalidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY + json);
        todosAPI.addNewTodo(jsonFile);

    }
}
