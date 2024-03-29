package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CartsAPI;
import starter.dummyjson.CartsResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;

public class postAddCartStepDef {
    @Steps
    CartsAPI cartsAPI;

    //    Positive
    @Given("Post a new carts with valid json {string}")
    public void postANewCartsWithValidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY + json);
        cartsAPI.postAddCarts(jsonFile);
    }

    @When("Send request post add cart")
    public void sendRequestPostAddCart() {
        SerenityRest.when().post(CartsAPI.ADD_CART);
    }

    //    Negative
    @Given("Post a new carts with invalid json {string}")
    public void postANewCartsWithInvalidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY + json);
        cartsAPI.postAddCarts(jsonFile);
    }
}
