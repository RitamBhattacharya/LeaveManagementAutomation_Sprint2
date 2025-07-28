#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Ask a Librarian - Email Form

  Scenario: Submit Email form with valid input
    Given I navigate to the Ask a Librarian page
    When I select the "Email" option
    And I enter a valid email and query
    And I submit the form
    Then I should see a success message

  Scenario: Submit Email form with invalid email format
    Given I navigate to the Ask a Librarian page
    When I select the "Email" option
    And I enter a malformed email
    And I submit the form
    Then I should see an error message "Invalid email format"

  Scenario: Submit Email form with blank query
    Given I navigate to the Ask a Librarian page
    When I select the "Email" option
    And I leave the email query field blank
    And I submit the form
    Then I should see an error message "Query is required"

Feature: Ask a Librarian - Call Option

  Scenario: Display call option contact info
    Given I navigate to the Ask a Librarian page
    When I select the "Call" option
    Then I should see the librarian contact number and hours

Feature: Ask a Librarian - Chat Form

  Scenario: Submit Chat form with valid input
    Given I navigate to the Ask a Librarian page
    When I select the "Chat" option
    And I enter valid Name, Phone, and Query
    And I submit the form
    Then I should see a success message

  Scenario: Submit Chat form with short phone number
    Given I navigate to the Ask a Librarian page
    When I select the "Chat" option
    And I enter a short phone number
    And I submit the form
    Then I should see an error message "Phone number must be 10 digits"

  Scenario: Submit Chat form with alphabetic phone number
    Given I navigate to the Ask a Librarian page
    When I select the "Chat" option
    And I enter alphabetic characters in the phone field
    And I submit the form
    Then I should see an error message "Invalid phone format"

  Scenario: Submit Chat form with blank name field
    Given I navigate to the Ask a Librarian page
    When I select the "Chat" option
    And I leave the name field blank
    And I submit the form
    Then I should see an error message "Name is required"

  Scenario: Submit Chat form with blank query field
    Given I navigate to the Ask a Librarian page
    When I select the "Chat" option
    And I leave the chat query field blank
    And I submit the form
    Then I should see an error message "Query is required"

  Scenario: Validate pre-filled Library field in Chat form
    Given I navigate to the Ask a Librarian page
    When I select the "Chat" option
    Then the Library field should be pre-filled





