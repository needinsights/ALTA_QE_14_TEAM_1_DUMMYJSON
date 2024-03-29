Feature: Get All Comments

  @Project
  Scenario: Get all comments
    Given Get all comments with valid parameter
    When Send request get all comments
    Then Status code should be 200
    And  Validate json schema "getAllCommentsSchema.json"

