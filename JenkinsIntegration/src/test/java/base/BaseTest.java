package test.java.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
    public static WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void initBrowser() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rjarayht\\Cucumber\\JenkinsIntegration\\src\\main\\resource\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    }

    @AfterSuite
    public void destroyBrowser() {
        driver.close();
    }
}
