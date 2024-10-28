@Sanity
Feature: Create New Account
  When a user Signs Up and interacts with the email to click the activation link, and logs in with the activated account.

  @TestCase
  Scenario: Fill Sign Up Form
    Given User Navigates to the MailChim WebPage
    And Signs Up a New Account
    And LogIn to Outlook App
    And Open the Activation Link Email
    And LogIn With the New Confirmed Account
