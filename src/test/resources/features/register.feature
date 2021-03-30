Feature: User  registration on utest.com

  Scenario: The user can register on the page with utest
    Given I am on the website
    When the user fills in the data of the first form
      | firstname | lastname | emailaddress             | dateofbirthmouth | dateofbirthday | dateofbirthyear |
      | Michael    | Abril  | maiicolabriil@hotmail.com | June              |             13 |            1994 |
    And the user fills in the data of the second form
      | ziporpostalcodefield |
      |               001121 |
    And the user fills in the data of the third form
      | computer | versionfield | languagefield |password|
      | Linux    | Ubuntu       | Spanish       |Password12345|
    Then the user can enter the password Complete Setup

