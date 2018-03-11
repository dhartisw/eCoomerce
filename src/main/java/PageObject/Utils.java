package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utils implements BasePage{

    public void clickAnElement(By by)
    {
        driver.findElement(by).click();
    }

    public void askdriverToWait()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void verifyOnHomePage(By by)
    {
        Assert.assertTrue(driver.findElement(by).isDisplayed());
    }
}
