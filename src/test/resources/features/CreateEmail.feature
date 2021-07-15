# language: en

@featureTest
Feature: Having an email provider
  I want to create an email account

  @Scenario1
  Scenario Outline: Create an email account
    Given I am in the create email page
    And i input the firstname <firtsname> 
    And input the lastname <lastname>
    And input the username <username>
    And input the password <password>
    And input the confirmedpassword <confirmedpassword>
    When I click in the next button
    Then I must be redirected to phone number authentication page


    Examples: 
      | firtsname | lastname | username  				| password		 | confirmedpassword |
      | Ticket 		| Test     | ticket.teste1996 |	7ekfUK7vfrPO | 7ekfUK7vfrPO			 |
