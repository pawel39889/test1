package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAnnotation {
    private WebDriver driver;

    public HomePageAnnotation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //By signInButton = By.xpath("//a[@class='login']");

    @FindBy(xpath = "//a[@class='login']")
    WebElement signInButton;

    public WebElement signInButton() {
        return signInButton;
    }
}
