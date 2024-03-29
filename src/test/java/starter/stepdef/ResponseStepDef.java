//package starter.stepdef;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import net.serenitybdd.rest.SerenityRest;
//import io.restassured.module.jsv.JsonSchemaValidator;
//
//import starter.utils.Constants;
//
//import java.io.File;
//
//import starter.dummyjson.CommentsResponse;
//import net.thucydides.core.annotations.Steps;
//
//import static org.hamcrest.Matchers.equalTo;
//
//public class ResponseStepDef {
//    @Then("Status code should be {int}")
//    public void apiShouldRespond(int statusCode) {
//        SerenityRest.then()
//                .statusCode(statusCode);
//    }
//
//    //     GET SINGLE USER
//    @And("Validate json Schema {string}")
//    public void validateJsonSchema(String json) {
//        File jsonFile = new File(Constants.JSON_SCHEMA + json);
//        SerenityRest.and()
//                .body(JsonSchemaValidator.matchesJsonSchema(jsonFile));
//    }
//}
//
