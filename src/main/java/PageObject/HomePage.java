package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage implements BasePage {
    public String url = "http://argos.co.uk";
   // public String url = "https://www.tesco.com/groceries/en-GB";

    public By technologLink = By.linkText("TECHNOLOGY");
    public By argosLogo = By.className("argos-header__logo");
    public By list = By.className("large-only");



    public void getHomePage(String url)
    {
        driver.get(url);
        driver.manage().window().maximize();
    }


}
