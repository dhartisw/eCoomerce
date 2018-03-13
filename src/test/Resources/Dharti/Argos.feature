
  Feature: User want to compare prize

    @swara
    Scenario: Add expensive T.v in Trolley

      Given User in on homepage
      When  User click on Technology
      And   User click on Televisions and accessories
      And   User click on Television
      And   User click on LG
      And   User select LG 49UJ651V 49 Inch Smart 4K Ultra HD TV with HDR
      Then User gets the text of that TV
      And  User click on Technology
      And  User click on Televisions and accessories
      And  User click on Television
      And  User click on samsung
      And  User click on Samsung UE22K5000 22 Inch Full HD LED TV
      And  User print maximum prize
      Then Maximum prize should be printed

