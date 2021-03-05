Feature: OrderPage
  Background:
  User navigate to the BliBli tab
    Given User on BliBli page

  Scenario: Verify tag in Orderdetailpage

    When User enters in the Orderdetailpage
    And User clicks Dibatalkan tag
    Then the first product is same as Dibatalkan tag