Feature: Update a cart
  Update a carts with valid json

  @Project
#  Positive
  Scenario: Update a cart with valid json and valid parameter id
    Given Put update a cart with valid json "PutUpdateCartValid.json" and parameter id 1
    When Send request to put update cart
    Then Status code should be 200
    And Validate json schema "PutUpdateCartValidJsonSchema.json"

#   Negative
  Scenario: Update a cart with invalid json and valid parameter id
    Given Put update a cart with invalid json "PutUpdateCartInvalid.json" and parameter id 1
    When Send request to put update cart
    Then Status code should be 400