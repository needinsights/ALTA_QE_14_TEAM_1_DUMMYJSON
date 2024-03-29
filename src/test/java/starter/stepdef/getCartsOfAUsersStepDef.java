package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CartsAPI;

public class getCartsOfAUsersStepDef {
    @Steps
    CartsAPI cartsAPI;

    @Given("Get carts of a user with valid parameter id {int}")
    public void getCartsOfAUserWithValidParameterId(int id) {
        cartsAPI.getCartsOfAUser(id);
    }

    @When("Send request to get cart of a user")
    public void sendRequestToGetCartOfAUser() {
        SerenityRest.when().get(CartsAPI.CARTS_USER);
    }

    @Given("Get carts of a user with invalid parameter {string}")
    public void getCartsOfAUserWithInvalidParameter(String id) {
        cartsAPI.getCartsOfAUserWithInvalid(id);
    }
}
