package Tests;

import org.testng.Assert;

public class DataProviderTest {
    9 calculator= new Calculator() ;
    public void testSum() {
        Assert.assertEquals(calculator.sum( 2, 3), 5, "Неверная сумма ...");
    }
}
