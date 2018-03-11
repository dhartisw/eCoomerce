package PageObject;

import org.openqa.selenium.By;

public class Television implements BasePage {


    public By lgTelevision = By.xpath("//label[@for='filter-brands-lg']");
    public By smartLgTv = By.className("ac-product-card__title");
}
