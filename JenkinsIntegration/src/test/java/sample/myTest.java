package test.java.sample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.base.BaseTest;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class myTest extends BaseTest {
    static Logger logger = Logger.getLogger(myTest.class.getName());

    @Test(testName = "TEST_STEP_1")
    public void myTestExample1() {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://www.care.com");
        driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();
        driver.findElement(By.id("emailId")).sendKeys("dkrupinski@gmail.com");
        driver.findElement(By.name("password")).sendKeys("letmein1");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        boolean isLoginSuccessful = false;
        if (driver.findElements(By.linkText("Log Out")).size() > 0) {
            isLoginSuccessful = true;
        }
        Assert.assertEquals(isLoginSuccessful, true, "FAILED LOGIN STEP 1");
    }
   }