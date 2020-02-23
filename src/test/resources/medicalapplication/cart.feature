Feature: Cart


  @cart
  Scenario: Discount

    Given user is in login page
    Given he logins into the application username "sriram.angajala@gmail.com" password "London12"
    When he search for "Digital Storm VANQUISH 3 Custom Performance PC"
    And go into the product "Digital Storm VANQUISH 3 Custom Performance PC"
    When he add an item into cart
    And go to cart
    And apply discount code with "akjdssdj"
    Then he should see an error message as "The coupon code you entered couldn't be applied to your order"