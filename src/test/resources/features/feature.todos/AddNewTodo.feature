Feature: post New Todos

  #Positive
  @Project
  Scenario: Get list all todos
    Given post new todo with valid json "UpdateBody.json"
    When Send request post new todo
    Then Status code should be 200
    And Validate json schema "UpdateBodySchema.json"



  #Negative
  @Project
  Scenario: Get list all todos
    Given post new todo with invalid json "UpdateBody.json"
    When Send request post new todo
    Then Status code should be 400
