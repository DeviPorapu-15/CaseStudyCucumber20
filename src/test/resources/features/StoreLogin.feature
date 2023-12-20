Feature: Store Login 

Background: User Login
Given User is on login page
When User enters "DeviDivya" and "Diya@8374"
Then User should be on Home Page

Scenario: Add item to cart
When Add an item to cart
#Then Item must be added to cart