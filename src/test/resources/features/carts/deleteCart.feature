Feature: Delete a cart
  Delete a cart with valid parameter

  @Project
  Scenario: Delete a cart with valid parameter
    Given Delete a cart with valid parameter id 1
    When Send request delete a cart
    Then Status code should be 200