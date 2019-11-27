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

  @FindBy(xpath = "//input[@id='email_create']")
  WebElement emailInput;

  @FindBy(xpath = "//button[@id='SubmitCreate']")
  WebElement createAccountButton;

  public void fillEmailClickButton(HashMap data) {
    fillEmailInput((String) data.get("email"));
    clickCreateAccountButton();
  }

  public void fillEmailInput(String email) {
    emailInput.sendKeys(email);
  }

  public void clickCreateAccountButton() {
    createAccountButton.click();
  }
}
