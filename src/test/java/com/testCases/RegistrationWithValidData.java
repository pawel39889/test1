package com.testCases;

import com.dataImport.DataContainer;

import com.objectRepository.AuthenticationPage;
import com.objectRepository.CreateAccountPage;
import com.objectRepository.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class RegistrationWithValidData {

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
  public void registration() throws InterruptedException, IOException {
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
    authenticationPage.fillEmailClickButton(dataFromProperties);

    // Create Account Page
    CreateAccountPage createAccountPage = new CreateAccountPage(driver);
    createAccountPage.fillForm(dataFromProperties);
    Thread.sleep(5000);
  }
}
