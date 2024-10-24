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
@Sanity
Feature: Create New Account
  When a user Signs Up and interacts with the email to click the activation link, and logs in with the activated account.

  @TestCase
  Scenario: Fill Sign Up Form
    Given User Navigates to the MailChim WebPage
    And Signs Up a New Account
    When LogIn to Outlook App
    And Open the Activation Link Email
    And LogIn With the New Confirmed Account
