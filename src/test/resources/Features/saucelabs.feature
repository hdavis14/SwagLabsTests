Feature: feature to test Sauce Labs website

#  Scenario Outline: Test 1: Order a product and checkout: <tcNo>
#    Given user is on login page
#    When user enters "<username>" and "<password>"
#    And clicks on the login button
#    And user is navigated to the home page and selects a product
#    And user adds product to shopping cart
#    And user navigates to shopping cart and checkout
#    And user enters <firstname>, <lastname> and <postcode> then clicks continue
#    Then user is navigated to the overview page and clicks finish
#    And user completes order
#
#    Examples:
#     |tcNo | Description                                                                    | username      | password    | firstname | lastname | postcode |
#     |SC01 | User purchases a single item form SwagLabs website and checks out successfully | standard_user | secret_sauce | howard   | Davis    | XX111XX  |
#
#
#  Scenario Outline: Test 2: User adds and removes a product: <tcNo>
#    Given user is on login page
#    When user enters "<username>" and "<password>"
#    And clicks on the login button
#    And user is navigated to the home page and selects a product
#    And user adds product to shopping cart
#    And user navigates to shopping cart
#    Then user removes product from the shopping cart
#    And user logs out
#    Examples:
#      |tcNo | Description                                                                   | username      | password     |
#      |SC02 | User adds and removes an item from the shopping cart on the SwagLabs website  | standard_user | secret_sauce |
#
#  Scenario Outline: Test 3: User navigates to the about page: <tcNo>
#    Given user is on login page
#    When user enters "<username>" and "<password>"
#    And clicks on the login button
#    And user is navigated to the home page and selects a product
#    Then user selects about link
#    And user is on the about page
#    Examples:
#      |tcNo | Description                        | username      | password    |
#      |SC03 | User accesses the about page | standard_user | secret_sauce |

  Scenario Outline: Test 4: Order a product and checkout: <tcNo>
    Given user is on login page
    When login with no credentials
    And user enters "<username>" and "<password>"
    And the error message matches <error_message>
    Examples:
      |tcNo | Description                                                       | error_message|
      |SC02 | User enters invalid credentials and returns a valid error message |              |

#  Scenario Outline: Test 1: Order a product and checkout: <tcNo>
#    Given user is on login page
#    When user enters "<username>" and "<password>"
#    And clicks on the login button
#    And user is navigated to the home page and selects a product
#    And user adds product to shopping cart
#    And user navigates to shopping cart and checkout
#    And user enters <firstname>, <lastname> and <postcode> then clicks continue
#    Then user is navigated to the overview page and clicks finish
#    And user completes order
#
#    Examples:
#      |tcNo | Description                                                                    | username      | password    | firstname | lastname | postcode |
#      |SC01 | User enters invalid data into the Your Information page | standard_user | secret_sauce | howard   | Davis    | XX111XX  |
