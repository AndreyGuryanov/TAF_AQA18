package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CalculatorTest extends BaseTest {

    @Test
    public void testSum() {
        Assert.assertEquals(calculator.sum( 2, 3), 5, "Неверная сумма ...");
    }

    @Test(enabled = false)
    public void testSum1() {
        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма ...");
    }

    @Test(description = "Тест с описанием")
    public void testSum2() {
        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма ...");
    }

    private int sum(int a, int b) {
    }

    @Test(testName = "Тест с названием")
    public void testSum3() {
        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма ...");
    }

    @Test(timeOut = 1000)
    public void testSum4() throws InterruptedException {
        Thread.sleep(500);
    }

    @Test(invocationCount = 6, invocationTimeOut = 1000, threadPoolSize = 3)
    public void testSum5() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма ...");
    }
    @Test
    public void exceptionTest() {
        List list = null;
        int size =list.size ();
    }
}
