package Tests;

import factory.BrowsersFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CSSSelectorTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersFactory().getDriver();
    }

    @AfterMethod

    public void tearDown() {
        driver.quit();
    }

    @Test
    public void cssLocatorTest(){
    driver.get("C:\\Users\\aggit\\Desktop\\TMS\\untitled1\\src\\test\\resources\\index.html");

        //    Поиск по ID

        Assert.assertTrue(driver.findElement(By.cssSelector("")).isDisplayed());


    }

}






