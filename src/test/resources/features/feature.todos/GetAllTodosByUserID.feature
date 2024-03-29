Feature: Get All Todos By User ID



  #Positive
  @Project
  Scenario: Get all Todo with valid user Id parameter
    Given Get all todos with valid user id 5
    When Send request get all todo
    Then Status code should be 200
    And Validate json schema "GetAllTodosByUserIdSchema.json"



  #Negative
  @Project
  Scenario: Get all Todo with invalid user Id parameter
    Given Get all todos with invalid user id 2300
    When Send request get all todo
    Then Status code should be 404
