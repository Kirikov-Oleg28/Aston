import org.example.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(factorial.calculateFactorial(5), 120);
    }

    @Test
    public void testFactorialZero() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(factorial.calculateFactorial(0), 1);
    }

    @Test
    public void testFactorialNegative() {
        Factorial factorial = new Factorial();
        try {
            factorial.calculateFactorial(-5);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Отрицательное число недопустимо", e.getMessage());
        }
    }
}
