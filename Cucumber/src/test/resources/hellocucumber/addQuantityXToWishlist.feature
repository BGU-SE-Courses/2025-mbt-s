Feature: User adds a quantity of X to the wishlist

  Scenario: User adds a quantity of X from product A to the wishlist
    Given the user is signed in
    And product A wasn't added to the wishlist before
    When the user adds a quantity of X to the wishlist
    Then the product is added to the wishlist with a quantity of X