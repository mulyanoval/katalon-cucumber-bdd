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

@loginFeature
Feature: Login

	Background:
	Given I open the website

  @test
  Scenario Outline: A user logins with valid credentials and is successfully navigated to the secure page with a success message
    When I fill in correct username <username> and correct password <password>
    And I click Login button
    Then I navigate to the Homepage and see a success message 'You logged into a secure area!'

    Examples: 
      | username  | password 													|
      | practice 	| T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI	|
      
  Scenario Outline: A user logins with empty credentials and is failed with an error message
    When I do not fill in username <username> and password <password>
    And I click Login button
    Then I see an error message 'Your username is invalid!'

    Examples: 
      | username  | password	|
      |  					|						|
      
  Scenario Outline: A user logins with incorrect username and is failed with an error message
    When I fill in incorrect username <username> and correct password <password>
    And I click Login button
    Then I see an error message 'Your password is invalid!'

    Examples: 
      | username  		| password 													|
      | practice123 	| T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI	|
      
  Scenario Outline: A user logins with incorrect password and is failed with an error message
    When I fill in correct username <username> and incorrect password <password>
    And I click Login button
    Then I see an error message 'Your password is invalid!'

    Examples: 
      | username  | password 									|
      | practice 	| T6bVo8B8lVBe/t9B/+G2yg==	|
      
  Scenario Outline: A user logins with incorrect username and incorrect password and is failed with an error message
    When I fill in incorrect username <username> and incorrect password <password>
    And I click Login button
    Then I see an error message 'Your password is invalid!'

    Examples: 
      | username  		| password 									|
      | practice123 	| T6bVo8B8lVBe/t9B/+G2yg==	|