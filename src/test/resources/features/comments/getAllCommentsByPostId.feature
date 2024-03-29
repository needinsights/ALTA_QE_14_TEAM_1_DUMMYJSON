Feature: Get Comment by PostId
  # Positive
  @Project
  Scenario: Get Comment by PostId
    Given Get all comments by PostId 5
    When send request to get Comment by PostId
    Then Status code should be 200
    And  Validate json Schema "getAllCommentsByPostIdSchema.json"

  # Negative
  @Project
  Scenario Outline: Get Invalid Comment by PostId
    Given Get all comments by PostId <id>
    When send request to get Comment by PostId
    Then Status code should be 404
    Examples:
      | id  |
      | 0   |
      | 600 |

