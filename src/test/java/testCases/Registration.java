package testCases;

import objectRepository.AuthenticationPage;
import objectRepository.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration {

    @Test
    public void Registration() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Selenium\\\\webdrivers\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        //Navigate to Sign in Page
        //HomePage homePage = new HomePage(driver);
        //homePage.signInButton().click();

        HomePage homePage = new HomePage(driver);
        homePage.signInButton().click();

        //Authentication Page
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.emailInput().sendKeys("asfojois@oaisdjf.pl");
        authenticationPage.createAccountButton().click();

        Thread.sleep(2000);
        driver.quit();



    }
}
