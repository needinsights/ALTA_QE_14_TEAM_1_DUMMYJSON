Feature: Get single cart
  Get single cart with parameter id

  @Project
#  Positive
  Scenario: Get single cart with valid parameter id
    Given Get single cart with valid parameter id 1
    When Send request to get single cart
    Then Status code should be 200
    And Validate json schema "getSingleCartValidJsonSchema.json"


  @Project
#   Negative
  Scenario: Get single cart with invalid parameter id
    Given Get single cart with invalid parameter id 2400
    When Send request to get single cart
    Then Status code should be 404
