package TestRozetkaAndDOU.DOU.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPageDOU extends BasePage {
    public MainPageDOU(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getContentMenu() {
        return getElements("//ul[@class='b-content-menu']/li");
    }
}