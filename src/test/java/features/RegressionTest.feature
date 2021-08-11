Feature: Regression Feature

  @Smoke
  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed

  @Regression
  Scenario: Create an account, buy something and check the order
    Given user is  on homepage
    When navigate to register page
    And complete personal information
    And complete address information at registration
    And verify that new account
    And go to dresses menu to choose a dress
    And add to shopping cart and make sure for product
    And complete address information at shopping cart
    And complete shipping information
    And choose payment type and complete order
    And navigate to order history to check order
    Then close web application