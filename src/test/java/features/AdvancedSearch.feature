Feature: Advanced Search Functionality

  Scenario: Validate author name with valid input
    Given the user is on the Advanced Search page
    When the user enters author name as "J.K. Rowling" and subject as "Fantasy"
    And selects edition as "Second"
    Then books related to author should be listed

  Scenario: Validate author name with blank input
    Given the user is on the Advanced Search page
    When the user leaves author name blank
    And enters subject as "Fiction"
    And selects edition as "First"
    Then an error message for author name should be displayed

  Scenario: Validate subject with blank input
    Given the user is on the Advanced Search page
    When the user enters author name as "Chetan Bhagat" and leaves subject blank
    And selects edition as "First"
    Then an error message for subject should be displayed

  Scenario: Validate book format with valid input
    Given the user is on the Advanced Search page
    When the user selects book format as "Hardcover"
    Then filtered books should be shown

  Scenario: Validate book format with blank input
    Given the user is on the Advanced Search page
    When the user does not select any book format
    Then an error message for book format should be displayed

  Scenario: Validate age group with valid selection
    Given the user is on the Advanced Search page
    When the user selects age group as "Teen"
    Then books for the selected age group should be listed

  Scenario: Validate age group with invalid input
    Given the user is on the Advanced Search page
    When the user does not select any age group
    Then an error message for age group should be displayed
