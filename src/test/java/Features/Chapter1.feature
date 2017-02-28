Feature: Chapter1Page
  This is page Chapter1

  Scenario: Navigate to page Chapter1
    Given Navigate to home page
    And I enter e-mail address as Email:admin
    And I will try to count digits in integer 15236
    And Click on link Chapter
    Then I should see following text on page Chapter
      | assertString                         |
      | Assert that this text is on the page |

  Scenario Outline: Navigate to page Chapter1 using outline
    Given Navigate to home page
    And Click on link Chapter
    Then I should see following text on page Chapter <assertString>

    Examples:
      | assertString                         |
      | Assert that this text is on the page |
      | Another assert                       |
      | And one more                         |
