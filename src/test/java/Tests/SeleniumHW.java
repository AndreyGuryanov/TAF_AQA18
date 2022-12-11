package Tests;

import factory.BrowsersFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumHW {
    public WebDriver driver;

   @BeforeMethod
    public  void setUp (){
       BrowsersFactory browsersFactory = new BrowsersFactory();
       driver = browsersFactory.getDriver();
   }



    @Test
    public void validateKermiCalculator() throws InterruptedException {
    driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");

    WebElement width = driver.findElement(By.id("el_f_width"));
    WebElement lenght = driver.findElement(By.id("el_f_lenght"));


    width.sendKeys("10");
    lenght.sendKeys("7");

//    Thread.sleep(2000);

    WebElement selectWebElement = driver.findElement(By.id("room_type"));
    Select selectRoomType = new Select(selectWebElement);
    selectRoomType.selectByIndex(1);
//    Thread.sleep(2000);

    WebElement selectWebElement2 = driver.findElement(By.id("heating_type"));
    Select selectHeatingType = new Select(selectWebElement2);
    selectHeatingType.selectByValue("3");
//    Thread.sleep(2000);

    WebElement calcButton = driver.findElement(By.cssSelector("[name='button']"));
    calcButton.click();
//    Thread.sleep(2000);

     Assert.assertEquals(driver.findElement(By.id("floor_cable_power")).getAttribute("value"),
             "4452" ) ;

     Assert.assertEquals(driver.findElement(By.id("spec_floor_cable_power")).getAttribute("value"),
             "64" ) ;

    }
    @AfterMethod
    public void tearDown (){
       driver.quit();
    }
}
