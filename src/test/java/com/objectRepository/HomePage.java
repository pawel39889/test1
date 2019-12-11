package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  private WebDriver driver;

  public HomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//a[@class='login']")
  WebElement signInButton;

  @FindBy(xpath = "//ul[@id='homefeatured']/li[1] //a[@itemprop='url']")
//  @FindBy(xpath = "//ul[@id='homefeatured']/li[1] //a[@class='button ajax_add_to_cart_button btn btn-default']")
  WebElement firstProduct;

  public void clickSignInButton() {
    signInButton.click();
  }

  public void firstProductClick() {
    this.firstProduct.click();
  }
}
