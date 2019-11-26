package com.objectRepository;

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

    //Method fills all form
    public void fillForm() {
        this.fillTitle();
        this.fillFirstNameCustomer("Janusz");
        this.fillLastNameCustomer("Kozak");
        //this.fillEmail("p@p.pl");
        this.fillPassword("asdasd123");
        this.fillDate("11","November","1980");
        this.fillAddressName("Janusz");
        this.fillAddressLastname("Kozak");
        this.fillCompanyName("Mustaffa");
        this.fillAddress1("ul. Nadbystrzycka");
        this.fillCity("Lublin");
        this.fillState("Alaska");
        this.fillZipCode("80210");
        this.fillCountry("UnitedStates");
        this.fillMobilePhone("500 500 500");
    }


    //Elements from Create Account Page
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement title;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstNameCustomer;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastNameCustomer;

    @FindBy(xpath = "//input[@id='email']") //check it by getting value from this place
    WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    WebElement days;

    @FindBy(xpath = "//select[@id='months']")
    WebElement months;

    @FindBy(xpath = "//select[@id='years']")
    WebElement years;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement addressName;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement addressLastname;

    @FindBy(xpath = "//input[@id='company']")
    WebElement companyName;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressFirstLine;

    @FindBy(xpath = "//input[@id='address2']")
    WebElement addressSecondLine;

    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipcode;

    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;

    @FindBy(xpath = "//textarea[@id='other']")
    WebElement additionalInformation;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhone;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhone;

    @FindBy(xpath = "//input[@id='alias']")
    WebElement alias;

    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerButton;

    //Methods to interact with all elements
    public void fillTitle() {
        title.click();
    }

    public void fillFirstNameCustomer(String name) {
        this.firstNameCustomer.sendKeys(name);
    }

    public void fillLastNameCustomer(String lastname) {
        this.lastNameCustomer.sendKeys(lastname);
    }

    public void fillEmail(String email) {
        this.email.sendKeys(email);
    }

    public void fillPassword(String password) {
        this.password.sendKeys(password);
    }

    public void fillDate(String day, String month, String year) {
        this.fillDays(day);
        this.fillMonths(month);
        this.fillYears(year);
    }

    public void fillDays(String day) {
        this.days.sendKeys(day);
    }

    public void fillMonths(String month) {
        this.months.sendKeys(month);
    }

    public void fillYears(String year) {
        this.years.sendKeys(year);
    }

    public void fillAddressName(String adressName) {
        this.addressName.sendKeys(adressName);
    }

    public void fillAddressLastname(String addressLastname) {
        this.addressLastname.sendKeys(addressLastname);
    }

    public void fillCompanyName(String companyName) {
        this.companyName.sendKeys(companyName);
    }

    public void fillAddress1(String firstLineAddress) {
        this.addressFirstLine.sendKeys(firstLineAddress);
    }

    public void fillAddress2(String secondLineAddress) {
        this.addressSecondLine.sendKeys(secondLineAddress);
    }

    public void fillCity(String city) {
        this.city.sendKeys(city);
    }

    public void fillState(String state) {
        this.state.sendKeys(state);
    }

    public void fillZipCode(String zipcode) {
        this.zipcode.sendKeys(zipcode);
    }

    public void fillCountry(String country) {
        this.country.sendKeys(country);
    }

    public void fillAdditionalInformation(String addiationalInformation) {
        this.additionalInformation.sendKeys(addiationalInformation);
    }

    public void fillHomePhone(String homephone) {
        this.homePhone.sendKeys(homephone);
    }

    public void fillMobilePhone(String mobilePhone) {
        this.mobilePhone.sendKeys(mobilePhone);
    }

    public void fillAlias(String alias) {
        this.alias.sendKeys(alias);
    }

    public void clickRegisterButton() {
        this.registerButton.click();
    }

}
