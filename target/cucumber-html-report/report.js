$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Dharti/Argos.feature");
formatter.feature({
  "line": 2,
  "name": "User want to compare prize",
  "description": "",
  "id": "user-want-to-compare-prize",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Add expensive T.v in Trolley",
  "description": "",
  "id": "user-want-to-compare-prize;add-expensive-t.v-in-trolley",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@swara"
    }
  ]
});
formatter.step({
  "line": 7,
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
  "name": "User gets the text of that TV",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User click on Technology",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User click on Televisions and accessories",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on Television",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click on samsung",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on Samsung UE22K5000 22 Inch Full HD LED TV",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User print maximum prize",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 17446883458,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnTechnology()"
});
formatter.result({
  "duration": 2345970047,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnTelevisionsAndAccessories()"
});
formatter.result({
  "duration": 7505893645,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnTelevision()"
});
formatter.result({
  "duration": 6745852212,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnLG()"
});
formatter.result({
  "duration": 2076603315,
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
  "duration": 2512365820,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userGetsTheTextOfThatTV()"
});
formatter.result({
  "duration": 9641905504,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnTechnology()"
});
formatter.result({
  "duration": 7940581192,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnTelevisionsAndAccessories()"
});
formatter.result({
  "duration": 2619817165,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnTelevision()"
});
formatter.result({
  "duration": 3278029116,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnSamsung()"
});
formatter.result({
  "duration": 8748845598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22",
      "offset": 24
    },
    {
      "val": "5000",
      "offset": 27
    },
    {
      "val": "22",
      "offset": 32
    }
  ],
  "location": "MyStepdefs.userClickOnSamsungUEKInchFullHDLEDTV(int,int,int)"
});
formatter.result({
  "duration": 1848331686,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userPrintMaximumPrize()"
});
formatter.result({
  "duration": 5944645736,
  "status": "passed"
});
});