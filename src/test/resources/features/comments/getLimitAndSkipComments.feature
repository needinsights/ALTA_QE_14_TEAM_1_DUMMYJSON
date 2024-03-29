Feature: Get Limit and Skip Comments
  #Positive
  @Project
Scenario Outline: Get limit and skip comments with valid parameter
Given Get limit and skip comments with valid parameter limit <limit> and skip <skip>
When Send request get skip comments
Then Status code should be 200
And Validate json Schema "getLimitAndSkipSchema.json"
Examples:
| limit | skip |
| 10   |  10 |

#Negative
  @Project
Scenario Outline: Get limit and skip comments with invalid parameter
  Given Get limit and skip comments with valid parameter limit <limit> and skip <skip>
  When Send request get skip comments
  Then Status code should be 400
  And Validate json Schema "getLimitAndSkipSchema.json"
  Examples:
    | limit | skip |
    | 9999   |  9999 |
