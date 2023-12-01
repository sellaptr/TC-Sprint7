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
Feature: Pelajari Selengkapnya dan Kunjungi Website
  I want to visit the bima website 

  @tag1
  Scenario Outline: As a user i want to click kunjungi website on the pelajari selengkapnya banner
    Given I click  Satudikti app
    When I choose the bima modul
    And I log in to the app with input <email> and <password>
    And I click pelajari selengkapnya
    And I click kunjungi website
    Then I direct to website

    Examples: 
      | email  | password | 
      | ahmadump@yahoo.co.id |     481965ah | 