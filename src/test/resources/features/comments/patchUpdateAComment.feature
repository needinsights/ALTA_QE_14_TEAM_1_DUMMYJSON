Feature: Patch update a comment

  @Project
  Scenario: Patch update a comment
    Given Patch update a comment with valid json "patchUpdateAComment.json"
    When Send request to patch update a comment
    Then Status code should be 200
    And Validate json schema "patchUpdateACommentSchema.json"
