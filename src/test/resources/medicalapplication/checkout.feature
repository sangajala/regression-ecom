Feature: Checkout

  Scenario: User can checkout single item

    Given user is in home page
    And go into the product "Digital Storm VANQUISH 3 Custom Performance PC"
    When he add an item into cart
    And go to cart
    And checkout as guest
    Then he should see "XYZ"