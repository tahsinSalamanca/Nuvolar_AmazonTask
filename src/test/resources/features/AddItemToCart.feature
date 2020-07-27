
Feature: Adding a new item to Cart

  @AddItemToCart
  Scenario: The user should be able to add new item to Cart
    Given  The user goes to to Amazon Website
    Then   The user search for "hats for men"
    And    The user select the first option
    Then   The user select quantity as "2" and add item to Cart
    And    The user should see total price and quantity on Cart pages
    Then   The user search for "hats for women"
    And    The user select the first option
    Then   The user select quantity as "1" and add item to Cart
    And    The user should see total price and quantity on Cart pages
    Then   The user Change the quantity for 2 nd item as 1 on Cart
    And    The user should see total price and quantity are changed correctly






