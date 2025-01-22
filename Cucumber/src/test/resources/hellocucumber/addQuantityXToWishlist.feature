Feature: User adds a quantity of X to the wishlist

  Scenario: User adds a quantity of X to the wishlist
    Given the user is signed in
    When the user adds a quantity of X to the wishlist
    Then the product is added to the wishlist with a quantity of X