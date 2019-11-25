package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
    private WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    WebElement title;

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

    public WebElement Title() {
        return title;
    }

    public WebElement Name() {
        return name;
    }

    public WebElement LastName() {
        return lastName;
    }

    public WebElement Email() {
        return email;
    }

    public WebElement Password() {
        return password;
    }

    public WebElement Days() {
        return days;
    }

    public WebElement Months() {
        return months;
    }

    public WebElement Years() {
        return years;
    }

    public WebElement AddressName() {
        return addressName;
    }

    public WebElement AddressLastname() {
        return addressLastname;
    }

    public WebElement AddressCompany() {
        return addressCompany;
    }

    public WebElement Address1() {
        return address1;
    }

    public WebElement Address2() {
        return address2;
    }

    public WebElement AddressCity() {
        return addressCity;
    }

    public WebElement AddressState() {
        return addressState;
    }

    public WebElement AddressZip() {
        return addressZip;
    }

    public WebElement AddressCountry() {
        return addressCountry;
    }

    public WebElement AdditionalInformation() {
        return additionalInformation;
    }

    public WebElement AddressHomePhone() {
        return addressHomePhone;
    }

    public WebElement AddressMobilePhone() {
        return addressMobilePhone;
    }

    public WebElement AddressAlias() {
        return addressAlias;
    }

    public WebElement RegisterButton() {
        return registerButton;
    }
}
