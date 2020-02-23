Feature: Home page

  @radha
  Scenario Outline: 4 User can change the currency can see the updated currency

    Given user is in home page
    When he selects the currency to "<currency>"
    Then the first product in homepage should have the price in "<symbol>"

    Examples:
      | currency  | symbol |
      | Euro      | €      |
      | US Dollar | $      |
