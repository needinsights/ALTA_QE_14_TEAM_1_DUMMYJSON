Feature: Get Carts of a user
  Get Carts of a user with valid id

  @Project
#    Positive
  Scenario: Get carts of a user with valid parameter id
    Given Get carts of a user with valid parameter id 5
    When Send request to get cart of a user
    Then Status code should be 200
    And Validate json schema "GetCartOfUserValidJsonSchema.json"

  @Project
#    Negative
  Scenario: Get carts of a user with invalid parameter id
    Given Get carts of a user with invalid parameter "@limo"
    When Send request to get cart of a user
    Then Status code should be 400