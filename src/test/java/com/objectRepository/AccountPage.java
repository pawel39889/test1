package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class AccountPage {
  private WebDriver driver;

  public AccountPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//a[@class='account']")
  WebElement customerAccountLink;

  public boolean loginVerification(HashMap data) {
    String username = data.get("name") + " " + data.get("lastName");

    if (!driver.getCurrentUrl().equals((String) data.get("accountPageLink"))) {
      return false;
    }
    if (!customerAccountLink.getText().equals(username)) {
      return false;
    }

    return true;
  }
}
