package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu {
  private WebDriver driver;

  public TopMenu(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  // Top menu buttons

  @FindBy(xpath = "//a[@title='Women']")
  WebElement womenButton;

  @FindBy(xpath = "//a[@title='Dresses']")
  WebElement dressesButton;

  @FindBy(xpath = "//a[@title='T-shirts']")
  WebElement tShirtsButton;

  // Top menu methods
    public void clickWomenButton() {
        womenButton.click();
    }

    public void clickDressesButton() {
        dressesButton.click();
    }

    public void clickTShirtsButton() {
        tShirtsButton.click();
    }
}
