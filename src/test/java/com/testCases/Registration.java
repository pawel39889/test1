package com.testCases;

import com.dataImport.DataContainer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Registration {

  private WebDriver driver;

  @BeforeTest
  public static void setupClass() {
    System.out.println("BeforeClass");
    WebDriverManager.chromedriver().setup();
  }

  @BeforeClass
  public void setupTest() {
    System.out.println("before");
    driver = new ChromeDriver();
  }

  @AfterTest
  public void teardown() {
    System.out.println("after");
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void registration() throws InterruptedException, IOException {
    String filePath = "src\\test\\resources\\data.properties";

    HashMap dataFromProperties = DataContainer.getPropertiesHashMap(filePath);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://automationpractice.com/index.php");


    /*

    //Driver settings
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Selenium\\webdrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://automationpractice.com/index.php");

    //Navigate to Sign in Page
    HomePage homePage = new HomePage(driver);
    homePage.signInButton().click();

    //Authentication Page
    AuthenticationPage authenticationPage = new AuthenticationPage(driver);
    authenticationPage.emailInput().sendKeys("asfojois@oaisdjf.pl");
    authenticationPage.createAccountButton().click();

    //Create Account Page
    CreateAccountPage createAccountPage = new CreateAccountPage(driver);
    createAccountPage.fillForm();
    */
  }
}
