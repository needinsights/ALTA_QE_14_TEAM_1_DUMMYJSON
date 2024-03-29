package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CartsAPI;

public class getSingleCartStepDef {
    @Steps
    CartsAPI cartsAPI;

    //    Positive
    @Given("Get single cart with valid parameter id {int}")
    public void getSingleCartWithValidParameterId(int id) {
        cartsAPI.getSingleCart(id);
    }

    @When("Send request to get single cart")
    public void sendRequestToGetSingleCart() {
        SerenityRest.when().get(CartsAPI.SINGLE_CART);
    }

    //    Negative
    @Given("Get single cart with invalid parameter id {int}")
    public void getSingleCartWithInvalidParameterId(int id) {
        cartsAPI.getSingleCart(id);
    }
}
