package com.objectRepository;

import com.sun.xml.internal.ws.util.xml.CDATA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.List;

public class ProductList {
  private WebDriver driver;

  public ProductList(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//ul[@class='product_list grid row']/li")
  List<WebElement> productsList;

  @FindBy(xpath = "//ul[@class='product_list grid row']")
  WebElement productListAsItem;

  // use only in reference to productsList items
  @FindBy(xpath = "//a[@class='product-name']")
  WebElement titleInsideProductList;

  @FindBy(xpath = "//a[@class='product-name']")
  WebElement item;

  @FindBy(xpath = "//a[@class='blockbestsellers']")
  WebElement bestSellersButton;

  @FindBy(xpath = "//ul[@id='blockbestsellers']/li")
  List<WebElement> bestsellersList;

  @FindBy(xpath = "//div[@class='top-pagination-content clearfix']//span[1]")
  WebElement compareButton;

  public boolean clickOnProductFromListed(HashMap data, WebDriver driver) {
    boolean containsName;
    boolean containsPrice;

    for (WebElement elementFromList : this.productsList) {
      containsName = elementFromList.getText().contains((String) data.get("productName"));
      containsPrice = elementFromList.getText().contains((String) data.get("productPrice"));

      if (containsName && containsPrice) {
        System.out.println(elementFromList.getText());
        //        elementFromList.findElement(By.xpath("//a[@class='quick-view']")).click();
        //        elementFromList.findElement(By.xpath("//a[@class='product_img_link']")).click();
        //        elementFromList.findElement(By.xpath("//a[@class='button lnk_view btn
        // btn-default']")).click();

        int productId = productsList.indexOf(elementFromList) + 1;

        String productUrl =
            "http://automationpractice.com/index.php?id_product="
                + productId
                + "&controller=product";
        System.out.println(productUrl);
        driver.get(productUrl);
        return true;
      }
    }

    return false;
  }

  public void bestSellersButtonclick() {
    this.bestSellersButton.click();
  }

  public String chooseProductFromBestsellersList(int number) {
    String productText = this.bestsellersList.get(number - 1).getText();
    String productTextSplited[] = productText.split("\n");
    return productTextSplited[0];

    //
  }

  public boolean productListContainsProduct(String productName) {
    for (WebElement product : productsList) {
      if (product.getText().contains(productName)) {
        return true;
      }
    }
    return false;
  }

  public void compareTwoProducts(HashMap data, Actions actions) throws InterruptedException {
    int i = 1;

    for (WebElement product : productsList) {
      actions.moveToElement(product).build().perform();
      product.findElement(By.xpath("//a[@class='add_to_compare']")).click();
      i++;
      Thread.sleep(2000);
    }
    compareButtonClick();
  }

  public void compareButtonClick() {
    this.compareButton.click();
  }
}
