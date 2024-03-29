package starter.dummyjson;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class TodosAPI {

    public static String GET_ALL_TODOS = Constants.BASE_URL + "/todos";
    public static String GET_A_SINGLE_TODO = Constants.BASE_URL + "/todos/{id}";
    public static String GET_A_RANDOM_TODO = Constants.BASE_URL + "/todos/random";
    public static String LIMIT_AND_SKIP_TODO = Constants.BASE_URL + "/todos?limit={limit}&skip={skip}";
    public static String GET_ALL_TODOS_BY_USER_ID = Constants.BASE_URL + "/todos/user/{id}";
    public static String ADD_NEW_TODO = Constants.BASE_URL + "/todos/add";
    public static String UPDATE_TODO = Constants.BASE_URL + "/todos/1";
    public static String DELETE_TODO = Constants.BASE_URL + "/todos/{id}";


    @Step("Get all todos")
    public void getAllTodos() {
        SerenityRest.given()
                .get(GET_ALL_TODOS);
    }

    @Step("Get a single todo")
    public void getSingleTodo(int id) {
        SerenityRest.given()
                .pathParam("id", id);
    }


    @Step("Get a Random todo")
    public void getARandomTodo() {
        SerenityRest.given()
                .get(GET_A_RANDOM_TODO);
    }


    @Step("Delete todo")
    public void deleteTodo(int id) {
        SerenityRest.given()
                .pathParam("id", id);
    }

    @Step("Update todo")
    public void putUpdateTodo(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }


    @Step("Limit and skip")
    public void getLimitAndSkip(int limit, int skip) {
        SerenityRest.given()
                .pathParam("limit", limit)
                .pathParam("skip", skip);
    }

    @Step("Post add new todo")
    public void addNewTodo(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }


    @Step("Get all todos by user id")
    public void setGetAllTodosByUserId(int id) {
        SerenityRest.given()
                .pathParam("id",id);
    }

}
