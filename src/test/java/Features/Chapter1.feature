Feature: Chapter1Page
  This is page Chapter1

  Scenario: Navigate to page Chapter1
    Given Navigate to home page
    And Click on link Chapter
    Then I should see following text on page Chapter
      | Text                                 |
      | Assert that this text is on the page |