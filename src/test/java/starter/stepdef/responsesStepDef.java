package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.dummyjson.CartsAPI;
import io.restassured.module.jsv.JsonSchemaValidator;
import starter.dummyjson.CartsResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;

public class responsesStepDef {
    @Steps
    CartsAPI cartsAPI;

    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @And("Validate json schema {string}")
    public void validateJsonSchema(String json) {
        File jsonFile = new File(Constants.JSON_SCHEMA + json);
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(jsonFile));
    }

    @And("Response body name should be userid {int}")
    public void responseBodyNameShouldBeUseridAndIdProduct(String userid) {
        SerenityRest.and()
                .body(CartsResponses.USERID, equalTo(userid));
    }
}
