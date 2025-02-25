Feature: feature to test SwagLabs website

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
     |tcNo | Description                                                                    | username      | password    | firstname | lastname | postcode |
     |SC01 | User purchases a single item form SwagLabs website and successfully checks out | standard_user | secret_sauce | howard   | Davis    | XX111XX  |


  Scenario Outline: Test 2: User adds and removes an item from the shopping cart on the SwagLabs website: <tcNo>
    Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks on the login button
    And user is navigated to the home page and selects a product
    And user adds product to shopping cart
    And user navigates to shopping cart
    Then user removes product from the shopping cart
    And user logs out
    Examples:
      |tcNo | Description                                                                   | username      | password     |
      |SC02 | User adds and removes an item from the shopping cart on the SwagLabs website  | standard_user | secret_sauce |

  Scenario Outline: Test 3: User navigates to the about page: <tcNo>
    Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks on the login button
    And user is navigated to the home page and selects a product
    Then user selects about link
    And user is on the about page
    Examples:
      |tcNo | Description                  | username      | password     |
      |SC03 | User navigates to the about page | standard_user | secret_sauce |

  Scenario Outline: Test 4: User enters invalid credentials and returns a valid error message: <tcNo>
    Given user is on login page
    When user enters "<username>" and "<password>"
    And  clicks on the login button
    Then the error message matches expected error <error_message>
    Examples:
      |tcNo | Description                                                       |  username      | password     | error_message |
      |IV01 | User enters invalid credentials and returns a valid error message |                |              |Epic sadface: Username is required|

  Scenario Outline: Test 5: User enters invalid data into the Your Information page: <tcNo>
    Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks on the login button
    And user is navigated to the home page and selects a product
    And user adds product to shopping cart
    And user navigates to shopping cart and checkout
    And user enters <firstname>, <lastname> and <postcode> then clicks continue
    Then the checkout error message matches expected error <error_message>

    Examples:
      |tcNo | Description                                             | username      | password    | firstname | lastname | postcode | error_message               |
      |IV01 | User enters invalid data into the Your Information page | standard_user | secret_sauce |          |          |          |Error: First Name is required|
