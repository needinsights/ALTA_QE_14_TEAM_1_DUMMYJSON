Feature: Get all carts
  Get all carts with valid id

  @Project
  Scenario: Get all carts with valid parameter id
    Given Get all carts with valid id
    When Send request all carts
    Then Status code should be 200
