package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class AuthenticationPage {
  private WebDriver driver;

  public AuthenticationPage(WebDriver driver) throws FileNotFoundException {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  //CREATE AN ACCOUNT section
  @FindBy(xpath = "//input[@id='email_create']")
  WebElement emailInput;

  @FindBy(xpath = "//button[@id='SubmitCreate']")
  WebElement createAccountButton;

  //ALREADY REGISTERED section
  @FindBy (xpath = "//input[@id='email']")
  WebElement emailForLogin;

  @FindBy (xpath = "//input[@id='passwd']")
  WebElement password;

  @FindBy (xpath = "//button[@id='SubmitLogin']")
  WebElement signInButton;

  public void fillEmailClickButton(HashMap data) {
    fillEmailInput((String) data.get("email"));
    clickCreateAccountButton();
  }

  public void login(HashMap data) {
    fillLoginEmail((String) data.get("email"));
    fillPassword((String) data.get("password"));
    clickSignInButton();
  }

  public void fillEmailInput(String email) {
    emailInput.sendKeys(email);
  }

  public void clickCreateAccountButton() {
    createAccountButton.click();
  }

  public void fillLoginEmail(String email) {
    emailForLogin.sendKeys(email);
  }

  public void fillPassword(String password) {
    this.password.sendKeys(password);
  }

  public void clickSignInButton() {
    signInButton.click();
  }


}
