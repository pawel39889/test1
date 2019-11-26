package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageWithoutAnnotation {
    private WebDriver driver;

    public HomePageWithoutAnnotation(WebDriver driver) {
        this.driver = driver;
    }

    By signInButton = By.xpath("//a[@class='login']");

    public WebElement signInButton() {
        return driver.findElement(signInButton);
    }
}
