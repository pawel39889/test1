package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By signInButton = By.xpath("//a[@class='login']");

    public WebElement signInButton() {
        return driver.findElement(signInButton);
    }
}
