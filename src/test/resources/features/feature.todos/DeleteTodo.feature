Feature: Delete todo with valid id

  @Project
  Scenario: Delete todo with valid id
    Given Delete todo with valid id 1
    When Send request  delete todos
    Then Status code should be 200