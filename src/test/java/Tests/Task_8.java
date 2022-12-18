package Tests;

import configuration.ReadProperties;
import factory.BrowsersFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_8 {
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
    public void loginTest() {
        driver.get(ReadProperties.getUrl());

        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username());
        driver.findElement(By.id("password")).sendKeys(ReadProperties.password());
        driver.findElement(By.id("login-button")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed());


        Assert.assertTrue(driver.findElement(By.xpath("//*[text()= 'Sauce Labs Backpack']")).isDisplayed());
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.className("shopping_cart_link")).click();
        Assert.assertTrue((driver.findElement(By.xpath("//div/span")).isDisplayed()));


        WebElement goodsName =driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        Assert.assertEquals(goodsName.getText(),
                "Sauce Labs Backpack");

        WebElement price = driver.findElement(By.cssSelector(".inventory_item_price"));
        Assert.assertEquals(price.getText(),
                "$29.99");

    }

}
