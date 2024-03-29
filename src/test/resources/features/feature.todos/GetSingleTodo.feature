Feature: Get Single Todo



  #Positive
  @Project
  Scenario: Get single todo with valid parameter id
    Given Get single todo with valid parameter id 1
    When Send request get single todo
    Then Status code should be 200
    And Validate json schema "GetSingleTodo.json"


  #Negative
  @Project
  Scenario: Get single todo with invalid parameter id
    Given Get single todo with invalid parameter id -1
    When Send request get single todo
    Then Status code should be 404