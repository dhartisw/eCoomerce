$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Dharti/AddToBasket.feature");
formatter.feature({
  "line": 1,
  "name": "User want to add some product in basket",
  "description": "",
  "id": "user-want-to-add-some-product-in-basket",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add product in basket",
  "description": "",
  "id": "user-want-to-add-some-product-in-basket;add-product-in-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User in on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on Technology",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on Televisions and accessories",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on Television",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on LG",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User select LG 49UJ651V 49 Inch Smart 4K Ultra HD TV with HDR",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click on ADD TO TROLLEY",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on GO TO TROLLEY",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User can see product in my trooley",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 27884133343,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnTechnology()"
});
formatter.result({
  "duration": 6490787593,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnTelevisionsAndAccessories()"
});
formatter.result({
  "duration": 3621856469,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnTelevision()"
});
formatter.result({
  "duration": 6708838376,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnLG()"
});
formatter.result({
  "duration": 2102877071,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "49",
      "offset": 15
    },
    {
      "val": "651",
      "offset": 19
    },
    {
      "val": "49",
      "offset": 24
    },
    {
      "val": "4",
      "offset": 38
    }
  ],
  "location": "MyStepdefs.userSelectLGUJVInchSmartKUltraHDTVWithHDR(int,int,int,int)"
});
formatter.result({
  "duration": 1892722366,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});