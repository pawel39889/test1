package com.testCases;

import com.dataImport.DataContainer;
import com.objectRepository.ProductDetails;
import com.objectRepository.ProductList;
import com.objectRepository.TopMenu;
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

public class SearchFeatureTest {
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
    public void testFeatureTest() throws IOException, InterruptedException {
        String filePath = "src\\test\\resources\\data.properties";
        HashMap dataFromProperties = DataContainer.getPropertiesHashMap(filePath);
        String productName;

        // Driver settings
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

        //ProductList choose bestsellers
        ProductList productList = new ProductList(driver);
        productList.bestSellersButtonclick();
        productName = productList.chooseProductFromBestsellersList(1);

        //TopMenu
        TopMenu topMenu = new TopMenu(driver);
        topMenu.searchProduct(productName);

        //Product List
        Assert.assertTrue(productList.productListContainsProduct(productName));

        Thread.sleep(3000);

    }
}
