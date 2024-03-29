package starter.dummyjson;


import io.cucumber.java.eo.Se;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class CommentsAPI {
    public static String GET_ALL_COMMENTS =  Constants.BASE_URL+"/comments";
    public static String GET_SINGLE_COMMENTS = Constants.BASE_URL+"/comments/{id}";
    public static String GET_All_COMMENTS_POSTID = Constants.BASE_URL+"/comments/post/{id}";
    public static String DELETE_COMMENT = Constants.BASE_URL+"/comments/{id}";
    public static String PATCH_UPDATE_A_COMMENT = Constants.BASE_URL+"/comments/1";
    public static String GET_LIMIT_AND_SKIP_COMMENTS = Constants.BASE_URL+"/comments?limit={limit}&skip={skip}&select=body,postId";
    public static String POST_ADD_COMMENT = Constants.BASE_URL+"/comments/add";

    // Get All Comments
    @Step("Get All Comments")
    public void getAllComments(){
        SerenityRest.given()
                .get(GET_ALL_COMMENTS);
    }

    // Get Single Comments
    @Step("Get Single Comments")
    public void getSingleComments(int id) {
        SerenityRest.given()
                .pathParam("id", id);
    }
    // Get All Comments by PostId
    @Step("Get All Comments by PostId")
    public void getAllCommentsByPostId(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    // Delete Comment
    @Step("Delete Comment")
    public void deleteComment(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    // Patch Update A Comment
    @Step("Patch Update a Comment")
    public void patchUpdateAComment(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    // Get Limit And Skip Comments
    @Step("Limit and skip")
    public void getLimitAndSkip(int limit, int skip){
        SerenityRest.given()
                .pathParam("limit", limit)
                .pathParam("skip", skip);
    }
    // Post Add Comments
    @Step("Add Comment")
    public void postAddComment(){
        SerenityRest.given()
                .get(POST_ADD_COMMENT);
    }



}
