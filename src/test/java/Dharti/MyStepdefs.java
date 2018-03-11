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
        utils.askdriverToWait();
        utils.clickAnElement(television.smartLgTv);
    }
}


