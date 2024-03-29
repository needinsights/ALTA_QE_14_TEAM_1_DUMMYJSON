Feature: Add a Comment
  #Positive
  @Project
  Scenario: Add a comment with valid json
    Given Add a comment with valid json "postAddComment.json"
    When Send request post add comment
    Then Status code should be 204
    And Validate json Schema "postAddCommentSchema.json"


  #Negative
  @Project
  Scenario: Add a comment with invalid json
    Given Add a comment with invalid json "postAddComment.json"
    When Send request post add comment
    Then Status code should be 415
