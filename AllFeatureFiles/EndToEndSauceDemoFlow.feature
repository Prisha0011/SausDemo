Feature: Test Sauce Demo Application

  Scenario: Test Login Functionality
    Given User is on Sauce Demo Application
    When User enter valid username and password
    Then Click on Login button

  Scenario: Test Home Page Functionality
    When User is on Home Page Validate Home Page Title
    Then Search Product and Add to the Cart
    Then Click on cart button

  Scenario: CheckOut Functionality
    Then Click on checkout button

  Scenario: Test User Information
    When User enters firstname lastname and zip code
    Then Click on continue button

  Scenario: Test Overview Page
    Then Click on Finish button
