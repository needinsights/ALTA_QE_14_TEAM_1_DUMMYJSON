package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.TodosAPI;
import io.restassured.module.jsv.JsonSchemaValidator;
import starter.utils.Constants;

import java.io.File;

public class GetSingleTodoStepdef {


    // Positive
    @Steps
    TodosAPI todosAPI;

    @Given("Get single todo with valid parameter id {int}")
    public void getSingleTodoWithValidParameterId(int id) {
        todosAPI.getSingleTodo(id);
    }

    @When("Send request get single todo")
    public void sendRequestGetSingleTodo() {
        SerenityRest.when().get(TodosAPI.GET_A_SINGLE_TODO);
    }

    // Negative
    @Given("Get single todo with invalid parameter id {int}")
    public void getSingleTodoWithInvalidParameterId(int id) {
        todosAPI.getSingleTodo(id);
    }

}