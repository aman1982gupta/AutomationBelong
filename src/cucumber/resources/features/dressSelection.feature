Feature: Dress Selection

Background: User is Logged In
    Given I am on the automation practice page
    When I hover on Dresses through Mega menu
    Then I am on Dresses page
    When I Select Summer Dresses
    Then I am on Summer Dresses page

  Scenario: Verification of sorting order of Dresses and selection of Blue dressError Message when entering incorrect email
    When I click on sorting Dresses dropdown
    And Sort Dresses by Price
    Then Dresses should be sorted correctly by price

  Scenario Outline: Verify that the selected dress is added correctly in the cart
     When I select a <color> color dress
     And I save the dress name and quantity
     And I add the item to cart
     Then I am on the Cart Page
     And Cart shows the correct dress name , color and quantity

     Examples:
           | color |
           | blue  |