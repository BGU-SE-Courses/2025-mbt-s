Feature: Admin reduces the quantity of product

  As a store administrator,
  I want to modify the quantity of a product to a value below a specified threshold (X),
  So that I can manage inventory levels and reflect low stock availability in the system.


  Background:
    Given I am a privileged administrator
    And I am logged in as an admin
    And I navigate to the the Dashboard sidebar
    And I click the {Products} button in Catalog section

  Scenario: Successfully reduce the quantity of product in the inventory
    And I select a product with stock quantity of 100
    And I click the {Edit} button
    And I choose the Stock section
    When I decrease the stock by 10
    Then the updated stock quantity should be 90
    And a confirmation message "Successful update" should be displayed

  Scenario: Attempt to set stock quantity to a negative value
    And I select a product with stock quantity of 50
    When I decrease the stock by 60
    Then an error message "Stock quantity cannot be negative" should be displayed
    And the stock quantity should remain 50

  Scenario: Successfully decrease stock for multiple combinations of a product
    And I select a product named "Hummingbird printed sweater"
    And I navigate to the "Combinations" section
    And the product has the following combinations:
      | Combination       | Current Stock |
      | Size - S          | 1200          |
      | Size - M          | 300           |
      | Size - L          | 300           |
      | Size - XL         | 300           |
    When I select the combinations:
      | Combination       |
      | Size - S          |
      | Size - M          |
    And I decrease the stock by 100 for the selected combinations
    Then the updated stock should be:
      | Combination       | Updated Stock |
      | Size - S          | 1100          |
      | Size - M          | 200           |
      | Size - L          | 300           |
      | Size - XL         | 300           |
    And a confirmation message "Successful update" should be displayed

  Scenario: Attempt to login with incorrect credentials
    Given I am on the admin login page
    When I enter the following credentials:
      | Username       | Password   |
      | admin@example.com  | wrongPass |
    And I click the "LOG IN" button
    Then I should remain on the login page
    And an error message "The employee does not exist" should be displayed




