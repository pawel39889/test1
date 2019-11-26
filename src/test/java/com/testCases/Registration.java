package com.testCases;
import com.dataImport.DataContainer;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Registration {

    public Registration() throws FileNotFoundException {
    }

    @Test
    public void registration() throws InterruptedException, IOException {
        Properties dataTestProperties = new Properties();
        String filePath = "C:\\Users\\rudnickp\\Documents\\projects\\test\\src\\test\\java\\data.properties";
        FileInputStream propertiesFileLocation = new FileInputStream("C:\\Users\\rudnickp\\Documents\\projects\\test\\src\\test\\java\\data.properties");
        dataTestProperties.load(propertiesFileLocation);

        DataContainer.gatherDataFromFile(filePath);




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