Feature: As a user, I can  create a new account on the utest platform

  Scenario: The user can register on the page with utest
    Given the user is on the website
    When the user fills in the data of the first form
      | firstname | lastname | emailaddress | dateofbirthmouth | dateofbirthday | dateofbirthyear |
      | Michael    | Abril  | maiicolabriil@hotmail.com | June | 13 | 1994 |
    And the user fills in the data of the second form
      | ziporpostalcodefield |
      |  001121 |
    And the user fills in the data of the third form
      | computer | versionfield | languagefield |password|
      | Linux    | Ubuntu       | Spanish       |Password12345|
    Then the user can enter the password Complete Setup

