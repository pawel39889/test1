package testCases;

import objectRepository.AuthenticationPage;
import objectRepository.CreateAccountPage;
import objectRepository.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Registration {

    public Registration() throws FileNotFoundException {
    }

    @Test
    public void registration() throws InterruptedException, IOException {
        Properties dataTestProperties = new Properties();
        FileInputStream propertiesFileLocation = new FileInputStream("C:\\Users\\rudnickp\\Documents\\projects\\test\\src\\test\\java\\data.properties");
        dataTestProperties.load(propertiesFileLocation);

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Selenium\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Selenium\\webdrivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

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
        //driver.findElement(By.xpath("#id_gender1")).click();
        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("aasdfasdf");
        driver.findElement(By.xpath("//input[@id='newsletter-input']")).sendKeys("works");
        driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("works");
        //driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("aisudfhasuidhfi");
        driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("FirstName");
        driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("asdijfoasdj");






    }
}
