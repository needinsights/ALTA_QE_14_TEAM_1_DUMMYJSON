package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CartsAPI;

public class getAllCartsStepDef {
    @Steps
    CartsAPI cartsAPI;

    @Given("Get all carts with valid id")
    public void getAllCartsWithValidId() {
        cartsAPI.getAllCarts();
    }

    @When("Send request all carts")
    public void sendRequestAllCarts() {
        SerenityRest.when().get(CartsAPI.ALL_CARTS);
    }
}
