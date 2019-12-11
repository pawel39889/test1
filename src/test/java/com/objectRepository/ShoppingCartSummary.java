package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartSummary {
  private WebDriver driver;

  public ShoppingCartSummary(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
  WebElement proceedToCheckoutButton;

  @FindBy(xpath = "//button[@name='processAddress']")
  WebElement processAddressButton;

  @FindBy(xpath = "//input[@id='cgv']")
  WebElement agreeToTermsCheckbox;

  @FindBy(xpath = "//button[@name='processCarrier']")
  WebElement processCarrierButton;

  @FindBy(xpath = "//a[@class='bankwire']")
  WebElement payByBankWireButton;

  @FindBy(xpath = "//a[@class='cheque']")
  WebElement payByCheck;

  @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
  WebElement confirmOrderButton;

  @FindBy(xpath = "//div[@class='box']")
  WebElement orderConfirmation;

  public boolean buyProductPayByBank() {
    proceedToCheckoutButtonClick();
    processAddressButtonClick();
    agreeToTermsCheckboxClick();
    processCarrierButtonClick();
    payByBankWireButtonClick();
    confirmOrderButton();
    return verifyPayByBank();
  }

  public boolean buyProductPayByCheck() {
    proceedToCheckoutButtonClick();
    processAddressButtonClick();
    agreeToTermsCheckboxClick();
    processCarrierButtonClick();
    payByCheck();
    confirmOrderButton();
    return verifyPayByCheck();
  }

  public void proceedToCheckoutButtonClick() {
    this.proceedToCheckoutButton.click();
  }

  public void processAddressButtonClick() {
    this.processAddressButton.click();
  }

  public void agreeToTermsCheckboxClick() {
    this.agreeToTermsCheckbox.click();
  }

  public void processCarrierButtonClick() {
    this.processCarrierButton.click();
  }

  public void payByBankWireButtonClick() {
    this.payByBankWireButton.click();
  }

  public void confirmOrderButton() {
    this.confirmOrderButton.click();
  }

  public void payByCheck() {
    this.payByCheck.click();
  }

  public boolean verifyPayByBank() {
    if (this.orderConfirmation.getText().contains("Your order on My Store is complete"))
      return true;

    return false;
  }

  public boolean verifyPayByCheck() {
    if (this.orderConfirmation
        .getText()
        .contains("You have chosen to pay by check. Here is a short summary of your order:"))
      return true;

    return false;
  }
}
