package com.testCases;

import com.dataImport.DataContainer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Registration {

  private WebDriver driver;

  @BeforeClass
  public static void setupClass() {
    WebDriverManager.chromedriver().setup();
  }

  @Before
  public void setupTest() {
    driver = new ChromeDriver();
  }

  @After
  public void teardown() {
    if (driver != null) {
      driver.quit();
    }
  }

  //public Registration() throws FileNotFoundException {}

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
