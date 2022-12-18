import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void test()
    {

        Calculator calculator=new Calculator();
        int sum=calculator.calc(7,7);
        Assert.assertEquals(14,sum);


    }
}
