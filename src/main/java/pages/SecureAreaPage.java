package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private final WebDriver driver;
    private By messageAfterLogin = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessageAfterLogin() {
        return driver.findElement(messageAfterLogin).getText();
    }

}
