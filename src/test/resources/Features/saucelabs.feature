Feature: feature to test Sauce Labs website

  Scenario Outline: Test 1: Order a product and checkout: <tcNo>
    Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks on the login button
    And user is navigated to the home page and selects a product
    And user adds product to shopping cart
    And user navigates to shopping cart and checkout
    And user enters <firstname>, <lastname> and <postcode> then clicks continue
    Then user is navigated to the overview page and clicks finish
    And user completes order

    Examples:
     |tcNo | Description            | username      | password    | firstname | lastname | postcode |
     |SC01 | Order a single product | standard_user | secret_sauce | howard   | Davis    | XX111XX  |


  Scenario Outline: Test 1: Order a product and checkout: <tcNo>
    Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks on the login button
    And user is navigated to the home page and selects a product
    And user adds product to shopping cart
    And user navigates to shopping cart and checkout
    And user enters <firstname>, <lastname> and <postcode> then clicks continue
    Then user is navigated to the overview page and clicks finish
    And user completes order

    Examples:
      |tcNo | Description            | username      | password    | firstname | lastname | postcode |
      |SC01 | Order a single product | standard_user | secret_sauce | howard   | Davis    | XX111XX  |
