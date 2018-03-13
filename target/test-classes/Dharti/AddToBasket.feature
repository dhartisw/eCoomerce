
Feature: User want to add some product in basket

   Scenario: Add product in basket

     Given User in on homepage
     When  User click on Technology
     And   User click on Televisions and accessories
     And   User click on Television
     And   User click on LG
     And   User select LG 49UJ651V 49 Inch Smart 4K Ultra HD TV with HDR
     And User gets its price and prints
     And   User click on ADD TO TROLLEY
     And   User click on GO TO TROLLEY
     Then  User can see product in my trooley