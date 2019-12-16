package com.testCases;

import com.dataImport.DataContainer;
import com.objectRepository.ComparePage;
import com.objectRepository.ProductList;
import com.objectRepository.TopMenu;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CompareItem {
  private WebDriver driver;

  @BeforeTest
  public static void setupClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeClass
  public void setupTest() {
    driver = new ChromeDriver();
  }

  @AfterTest
  public void teardown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void compareItems() throws IOException, InterruptedException {
    String filePath = "src\\test\\resources\\data.properties";
    HashMap dataFromProperties = DataContainer.getPropertiesHashMap(filePath);
    String productName;
    Actions actions = new Actions(driver);

    // Driver settings
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://automationpractice.com/index.php");

    // TopMenu
    TopMenu topMenu = new TopMenu(driver);
    topMenu.summerDressFromSubmenuClick(actions);
    Thread.sleep(3000);

    // Product List
    ProductList productList = new ProductList(driver);
    productList.compareTwoProducts(dataFromProperties, actions);
    Thread.sleep(3000);

    // Compare Page
    ComparePage comparePage = new ComparePage(driver);
    Assert.assertTrue(comparePage.compareHeading(dataFromProperties));
  }
}
