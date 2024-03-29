Feature: Get all todos


  @Project
  Scenario: Get list all todos
    Given Get list all todos
    When Send request get list todos
    Then Status code should be 200