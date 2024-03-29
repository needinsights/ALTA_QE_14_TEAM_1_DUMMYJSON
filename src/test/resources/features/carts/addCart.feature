Feature: Post a new cart
  Add a new cart with valid json

  @Tugas
#    Positive
  Scenario: Add a new carts with valid json
    Given Post a new carts with valid json "postAddCart.json"
    When Send request post add cart
    Then Status code should be 200
    And Validate json schema "PostAddCartJsonSchema.json"

#    Negative
  Scenario: Add a new carts with invalid json
    Given Post a new carts with invalid json "PostAddCartInvalid.json"
    When Send request post add cart
    Then Status code should be 404