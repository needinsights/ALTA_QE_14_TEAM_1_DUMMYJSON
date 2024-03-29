package starter.dummyjson;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.checkerframework.checker.units.qual.C;
import starter.utils.Constants;

import java.io.File;

public class CartsAPI {
    public static String ALL_CARTS = Constants.BASE_URL + "/carts";
    public static String SINGLE_CART = Constants.BASE_URL + "/carts/{id}";
    public static String CARTS_USER = Constants.BASE_URL + "/carts/user/{id}";
    public static String ADD_CART = Constants.BASE_URL + "/carts/add";
    public static String UPDATE_CART = Constants.BASE_URL + "/carts/{id}";
    public static String DELETE_CART = Constants.BASE_URL + "/carts/{id}";


    @Step("Get all carts with valid id")
    public void getAllCarts() {
        SerenityRest.given().get(ALL_CARTS);
    }

    @Step("Get single cart")
    public void getSingleCart(int id) {
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Get carts of a user")
    public void getCartsOfAUser(int id) {
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Get carts of a user with invalid parameter id")
    public void getCartsOfAUserWithInvalid(String id) {
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Post add cart")
    public void postAddCarts(File json) {
        SerenityRest.given().contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Update a cart")
    public void putUpdateCart(int id, File json) {
        SerenityRest.given().pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Delete a cart")
    public void deleteCart(int id) {
        SerenityRest.given().pathParam("id", id);
    }
}
