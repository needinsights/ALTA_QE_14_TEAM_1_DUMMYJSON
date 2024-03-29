Feature: Get a Random todo


  #Positive
  @Project
  Scenario: Get a Random todo
    Given Get a random todo with valid parameter
    When Send request get a random todo
    Then Status code should be 200
    And Validate json schema "GetRandomTodoSchema.json"


  #Negative
  @Project
  Scenario: Get a Random todo
    Given Get a random todo with invalid parameter
    When Send request get a random todo
    Then Status code should be 404
