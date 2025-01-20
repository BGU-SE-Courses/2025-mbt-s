Feature: Admin reduces the quantity of a product to less than X

  Scenario: Admin reduces the quantity of a product to less than X
    Given the admin is signed in
    When the admin reduces the quantity of a product to less than X
    Then the product is removed from the inventory