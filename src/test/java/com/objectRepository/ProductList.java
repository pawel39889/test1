package com.objectRepository;

import com.sun.xml.internal.ws.util.xml.CDATA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.List;

public class ProductList {
    private WebDriver driver;
    private PhantomReference data;

    public ProductList(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='product_list grid row']")
    List<WebElement> productsList;

    //use only in reference to productsList items
    @FindBy(xpath = "//a[@class='product-name']")
    WebElement titleInsideProductList;

    @FindBy(xpath = "//a[@class='product-name']")
    WebElement item;


    public boolean clickElementFromProductList(HashMap data) {

        for (WebElement elementFromList : this.productsList) {
            if (!elementFromList.getText().contains((String) data.get("productName"))) {
                if (!elementFromList.getText().contains((String) data.get("productPrice"))) {
                    productsList.remove(elementFromList);
                }
            }
        }

        if (productsList.size() == 1) {
            productsList.get(0).
            return true;
        }

        return false;


    }
}
