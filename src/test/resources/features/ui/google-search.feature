
  Feature: Google search functionality


    Scenario: User should be able to search for the item
      Given User is on google home page
      When  User inputs item name in search box and clicks search button
      Then  User should see search results









        Scenario:
          Given User is on google home page
          When   User inputs "item" name in search box and clicks search button

            | cucumber |
            | pen      |
            | apple    |