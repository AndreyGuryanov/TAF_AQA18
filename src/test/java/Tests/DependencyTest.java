package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test
    public void  stepb() {
        Integer Calculator;
        Assert.assertEquals(Calculator.sum (2,3));
    }
}
