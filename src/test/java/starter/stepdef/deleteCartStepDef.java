package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CartsAPI;

public class deleteCartStepDef {
    @Steps
    CartsAPI cartsAPI;

    @Given("Delete a cart with valid parameter id {int}")
    public void deleteACartWithValidParameterId(int id) {
        cartsAPI.deleteCart(id);
    }

    @When("Send request delete a cart")
    public void sendRequestDeleteACart() {
        SerenityRest.when().delete(CartsAPI.DELETE_CART);
    }
}
