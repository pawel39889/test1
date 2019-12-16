package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class ComparePage {
  private WebDriver driver;

  public ComparePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//h1[@class='page-heading']")
  WebElement heading;

  public boolean compareHeading(HashMap data) {
    System.out.println(heading.getText());
    System.out.println(data.get("heading"));

    if (this.heading.getText().equals(data.get("heading"))) {
      return true;
    }

    return false;
  }
}
