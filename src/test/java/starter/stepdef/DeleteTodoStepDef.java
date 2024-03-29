package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.TodosAPI;

public class DeleteTodoStepDef {

    @Steps
    TodosAPI todosAPI;

    @Given("Delete todo with valid id {int}")
    public void deleteTodoWithValidId(int id) {
        todosAPI.deleteTodo(id);
    }

    @When("Send request  delete todos")
    public void sendRequestDeleteTodos() {
        SerenityRest.when()
                .delete(TodosAPI.DELETE_TODO);
    }

}
