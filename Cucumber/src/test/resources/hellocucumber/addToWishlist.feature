Feature: Add Products to Wishlist with Quantity

  As a registered user
  I want to add products to my wishlist with a specific quantity
  So that I can keep track of items I'm interested in purchasing later

  Background:
    Given I am a registered user
    And I am signed in to my account

  Scenario: Successfully add a product to the wishlist with a specific quantity
    When I select a product
    And I specify a quantity of 3
    And I click the "Add to Wishlist" button
    Then the product should be added to my wishlist
    And my wishlist should show the product with a quantity of 3
    And I should see a confirmation message "Product added to wishlist"

  Scenario: Add multiple products to the wishlist with different quantities
    When I add the following products to my wishlist:
      | Product Name | Quantity |
      | Laptop       | 1        |
      | Headphones   | 2        |
      | Mouse        | 3        |
    Then all products should be present in my wishlist
    And each product should have the specified quantity

  Scenario: Update quantity of an existing product in the wishlist
    Given I have a product in my wishlist with quantity 1
    When I update the quantity to 5
    Then the product quantity in my wishlist should be updated to 5
    And I should see a confirmation message "Wishlist updated successfully"

  Scenario: Add a product to the wishlist that already exists
    Given I have a product in my wishlist with quantity 2
    When I add the same product with quantity 3
    Then the product quantity in my wishlist should be updated to 5
    And I should see a confirmation message "product added"

  Scenario: Attempt to add a product to wishlist when not signed in
    Given I am not signed in
    When I try to add a product to my wishlist
    Then I should see a message "Sign in"