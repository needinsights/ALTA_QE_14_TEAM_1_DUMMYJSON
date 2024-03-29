Feature: Update todo


  @Project
  Scenario: Update todo with valid json
    Given Update todo with valid json "UpdateBody.json"
    When Send request put update todo
    Then Status code should be 200
    And Validate json schema "UpdateSchema.json"

