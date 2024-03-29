Feature: Limit and skip todos


  @Project
  #Positive
  Scenario Outline: Get all Todo with valid user Id parameter
    Given Get limit and skip todos with valid parameter limit <limit> and skip <skip>
    When Send request get skip todo
    Then Status code should be 200
    And Validate json schema "LimitAndSkipSchema.json"
    Examples:
      | limit | skip |
      | 10    | 10   |