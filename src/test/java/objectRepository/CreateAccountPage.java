package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
    private WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By name = By.id("customer_firstname");

    public WebElement getName() {
        return driver.findElement(name);
    }

    /*
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastName;

    public WebElement lastName() {
        return lastName;
    } */

    /*
    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    WebElement title;

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailInput;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement name;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='email']") //check it by getting value from this place
    WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    WebElement days;

    @FindBy(xpath = "//select[@id='moths']")
    WebElement months;

    @FindBy(xpath = "//select[@id='years']")
    WebElement years;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement addressName;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement addressLastname;

    @FindBy(xpath = "//input[@id='company']")
    WebElement addressCompany;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    WebElement address2;

    @FindBy(xpath = "//input[@id='city']")
    WebElement addressCity;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement addressState;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElement addressZip;

    @FindBy(xpath = "//select[@id='id_country']")
    WebElement addressCountry;

    @FindBy(xpath = "//textarea[@id='other']")
    WebElement additionalInformation;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement addressHomePhone;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement addressMobilePhone;

    @FindBy(xpath = "//input[@id='alias']")
    WebElement addressAlias;

    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerButton;

    public WebElement fillTitle() {
        return title;
    }

    public WebElement fillName() {
        return name;
    }

    public WebElement fillLastName() {
        return lastName;
    }

    public WebElement fillEmail() {
        return email;
    }

    public WebElement fillPassword() {
        return password;
    }

    public WebElement fillDays() {
        return days;
    }

    public WebElement fillMonths() {
        return months;
    }

    public WebElement fillYears() {
        return years;
    }

    public WebElement fillAddressName() {
        return addressName;
    }

    public WebElement fillAddressLastname() {
        return addressLastname;
    }

    public WebElement fillAddressCompany() {
        return addressCompany;
    }

    public WebElement fillAddress1() {
        return address1;
    }

    public WebElement fillAddress2() {
        return address2;
    }

    public WebElement fillAddressCity() {
        return addressCity;
    }

    public WebElement fillAddressState() {
        return addressState;
    }

    public WebElement fillAddressZip() {
        return addressZip;
    }

    public WebElement fillAddressCountry() {
        return addressCountry;
    }

    public WebElement fillAdditionalInformation() {
        return additionalInformation;
    }

    public WebElement fillAddressHomePhone() {
        return addressHomePhone;
    }

    public WebElement fillAddressMobilePhone() {
        return addressMobilePhone;
    }

    public WebElement fillAddressAlias() {
        return addressAlias;
    }

    public WebElement fillRegisterButton() {
        return registerButton;
    }

     */
}
