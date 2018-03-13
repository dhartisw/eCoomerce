package Dharti;

import PageObject.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyStepdefs {
    HomePage homePage = new HomePage( );
    Utils utils = new Utils( );
    Technology technology = new Technology( );
    TelevisionAndAccessories televisionAndAccessories = new TelevisionAndAccessories( );
    Television television = new Television( );
    LgHdTv lgHdTv = new LgHdTv( );
    AddedToTrolley addedToTrolley = new AddedToTrolley( );
    ShopAllGroceries shopAllGroceries = new ShopAllGroceries();
    Tesco tesco = new Tesco();
    SamsungUETV samsungUETV = new SamsungUETV();

    @Given("^User in on homepage$")

    public void userIsOnHomePage() throws Throwable {
        homePage.getHomePage(homePage.url);
        utils.askdriverToWait( );
        utils.verifyOnHomePage(homePage.argosLogo);

    }

    @When("^User click on Technology$")
    public void userClickOnTechnology() throws Throwable {
        utils.clickAnElement(homePage.technologLink);
        utils.askdriverToWait( );
    }

    @And("^User click on Televisions and accessories$")
    public void userClickOnTelevisionsAndAccessories() throws Throwable {
        utils.clickAnElement(technology.televisionAndAccessories);
    }


    @And("^User click on Television$")
    public void userClickOnTelevision() throws Throwable {
        utils.clickAnElement(televisionAndAccessories.television);
        utils.askdriverToWait( );

    }


    @And("^User click on LG$")
    public void userClickOnLG() throws Throwable {
        utils.askdriverToWait( );

        utils.clickAnElement(television.lgTelevision);
    }


    @And("^User select LG (\\d+)UJ(\\d+)V (\\d+) Inch Smart (\\d+)K Ultra HD TV with HDR$")
    public void userSelectLGUJVInchSmartKUltraHDTVWithHDR(int arg0, int arg1, int arg2, int arg3) throws Throwable {
        utils.askdriverToWait( );
        utils.clickAnElement(television.smartLgTv);
    }

    @And("^User click on ADD TO TROLLEY$")
    public void userClickOnADDTOTROLLEY() throws Throwable {
        utils.askdriverToWait( );
        utils.clickAnElement(lgHdTv.addToTrolley);
    }

    @And("^User click on GO TO TROLLEY$")
    public void userClickOnGOTOTROLLEY() throws Throwable {
        utils.askdriverToWait( );
        utils.clickAnElement(addedToTrolley.addItem);
        utils.askdriverToWait( );
        utils.clickAnElement(addedToTrolley.goToTrolley);
    }

    @Then("^User can see product in my trooley$")
    public void userCanSeeProductInMyTrooley() throws Throwable {

    }

    @And("^User gets its price and prints$")
    public void userGetsItsPriceAndPrints() throws Throwable {

    }


    @Given("^User is on homepage$")
    public void userIsOnHomepage() throws Throwable {
    homePage.getHomePage(homePage.url);

    }

    @When("^User click on Groceries$")
    public void userClickOnGroceries() throws Throwable {
     utils.askdriverToWait();
     utils.clickAnElement(homePage.list);
    }

    @And("^User click on Drinks$")
    public void userClickOnDrinks() throws Throwable {
     utils.clickAnElement(shopAllGroceries.listOffGroceries);

    }

    @Then("^User gets the text of that TV$")
    public int userGetsTheTextOfThatTV() throws Throwable {
    String priceText = utils.getTextFromALocator(lgHdTv.priceText);
    String prizeLG = priceText.substring(1,4);
    int price = Integer.parseInt(prizeLG);
    return price;
    }

    @And("^User click on samsung$")
    public void userClickOnSamsung() throws Throwable {
        utils.askdriverToWait();
     utils.clickAnElement(television.samsungSmartTv);
    }

    @And("^User click on Samsung UE(\\d+)K(\\d+) (\\d+) Inch Full HD LED TV$")
    public void userClickOnSamsungUEKInchFullHDLEDTV(int arg0, int arg1, int arg2) throws Throwable {
    utils.askdriverToWait();
    utils.clickAnElement(television.samsung);
    }

    @And("^User print maximum prize$")
    public int userPrintMaximumPrize() throws Throwable {
        String samsungPrizeText = utils.getTextFromALocator(samsungUETV.prizeText);
        String prizeSamsung = samsungPrizeText.substring(1,4);
        int prizeOne = Integer.parseInt(prizeSamsung);
        return prizeOne;
    }

    @Then("^Maximum prize should be printed$")
    public void maximumPrizeShouldBePrinted() throws Throwable {

        int a = userGetsTheTextOfThatTV( );
        int b = userPrintMaximumPrize( );

        if (a>b) {
            System.out.println(a);
        }
        else
        {
            System.out.println(b );
        }
    }

}


