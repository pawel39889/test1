package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {
    private WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailInput;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createAccountButton;

    public WebElement emailInput() {
        return emailInput;
    }

    public WebElement createAccountButton() {
        return createAccountButton;
    }
}
