package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CartsAPI;
import starter.utils.Constants;

import java.io.File;

public class updateCartStepDef {

    @Steps
    CartsAPI cartsAPI;

    //    Positive
    @Given("Put update a cart with valid json {string} and parameter id {int}")
    public void putUpdateACartWithValidJsonAndParameterId(String json, int id) {
        File jsonFile = new File(Constants.REQ_BODY + json);
        cartsAPI.putUpdateCart(id, jsonFile);
    }

    @When("Send request to put update cart")
    public void sendRequestToPutUpdateCart() {
        SerenityRest.when().put(CartsAPI.UPDATE_CART);
    }

    //Negative
    @Given("Put update a cart with invalid json {string} and parameter id {int}")
    public void putUpdateACartWithInvalidJsonAndParameterId(String json, int id) {
        File jsonFile = new File(Constants.REQ_BODY + json);
        cartsAPI.putUpdateCart(id, jsonFile);
    }
}
