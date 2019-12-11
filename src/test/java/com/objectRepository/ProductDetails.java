package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductDetails {
    private WebDriver driver;

    public ProductDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;

    @FindBy(xpath = "//option[contains(text(),'')]")
    List<WebElement> sizeOption;

    @FindBy(xpath = "//ul[@id='color_to_pick_list']/li")
    List<WebElement> colorOption;

    @FindBy(xpath = "//button[@name='Submit']")
    WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='cross']")
    WebElement popupCorss;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement popupProceedToCheckoutButton;

    public void chooseAllVariantOfProduct() throws InterruptedException {
        for (int i = 0; i < sizeOption.size(); i++) {
            if (i + 1 == sizeOption.size()) {
                productQuantity(2);
            }

            sizeOption.get(i).click();
            Thread.sleep(1000);
            for(int j = 0; j < colorOption.size(); j++) {
                colorOption.get(j).click();
                Thread.sleep(1000);
                addToCartButtonClick();
                popupCrossClick();
            }


        }

    }

    public void productQuantity(int quantity) {
        this.quantity.clear();
        this.quantity.sendKeys(String.valueOf(quantity));
    }

    public void chooseProperSize(String size) {
        //this.sizeOption.sendKeys(size);
    }

    public void addToCartButtonClick() {
        this.addToCartButton.click();
    }

    public void popupCrossClick() {
        this.popupCorss.click();
    }

    public void popupProceedToCheckoutButtonClick() {
        this.popupProceedToCheckoutButton.click();
    }
}
