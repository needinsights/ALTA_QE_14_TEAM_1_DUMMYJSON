package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.TodosAPI;
import starter.utils.Constants;

import java.io.File;

public class PutUpdateTodoStepDef {

    @Steps
    TodosAPI todosAPI;

    @Given("Update todo with valid json {string}")
    public void updateTodoWithValidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY + json);
        todosAPI.putUpdateTodo(jsonFile);
    }

    @When("Send request put update todo")
    public void sendRequestPutUpdateTodo() {
        SerenityRest.when()
                .put(TodosAPI.UPDATE_TODO);
    }


    @Given("Update todo with invalid json {string}")
    public void updateTodoWithInvalidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY + json);
        todosAPI.putUpdateTodo(jsonFile);
    }
}
