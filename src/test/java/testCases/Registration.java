package testCases;

import objectRepository.HomePage;
import objectRepository.HomePageAnnotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration {

    @Test
    public void Registration() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Selenium\\\\webdrivers\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        //Navigate to Sign in Page
        //HomePage homePage = new HomePage(driver);
        //homePage.signInButton().click();

        HomePageAnnotation homePageAnnotation = new HomePageAnnotation(driver);
        homePageAnnotation.signInButton().click();



    }
}
