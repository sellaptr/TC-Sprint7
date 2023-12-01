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
@tag
Feature: Lihat Modul BIMA
  I want to see BIMA Modul

  @tag1
  Scenario Outline: As a user i want to see the bima modul after login
    Given I am open the app
    When I am click the skip button
    When I click the lainnya button
    And I click the bima modul
    And I click the for login button
    Then I on login page
    And I input the email <email>
    And I input the password <password>
    Then I click the login button
    And I on the agree page
    Then I click the setuju button
    Then Iam on the Modul Bima <status>

    Examples: 
      | email                | password | status  |
      | ahmadump@yahoo.co.id | 481965ah | success |
