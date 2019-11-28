package com.testCases;

import com.dataImport.DataContainer;
import com.objectRepository.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class ChoosingProductInEveryPossibleVariant {
  WebDriver driver;

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
  public void ChoosingProductInEveryPossibleVariant() throws IOException, InterruptedException {
    String filePath = "src\\test\\resources\\data.properties";
    HashMap dataFromProperties = DataContainer.getPropertiesHashMap(filePath);

    // Driver settings
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://automationpractice.com/index.php");

    // Navigate to Sign in Page
    HomePage homePage = new HomePage(driver);
    homePage.clickSignInButton();

    // Authentication Page
    AuthenticationPage authenticationPage = new AuthenticationPage(driver);
    authenticationPage.login(dataFromProperties);

    // Account Page
    AccountPage accountPage = new AccountPage(driver);
    Assert.assertTrue(accountPage.loginVerification(dataFromProperties));

    // Top Menu click
      TopMenu topMenu = new TopMenu(driver);
      topMenu.clickWomenButton();

      // Product list
      ProductList productList = new ProductList(driver);
      Assert.assertTrue(productList.clickElementFromProductList(dataFromProperties));


    Thread.sleep(5000);
  }
}
