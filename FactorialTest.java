import org.example.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {


    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        assertEquals(120, factorial.calculateFactorial(5));

    }


    @Test
    public void testFactorialZero() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateFactorial(0));
    }

    @Test
    public void testFactorialNegative() {
        Factorial factorial = new Factorial();
        try {
            factorial.calculateFactorial(-5);
        } catch (IllegalArgumentException e) {
            assertEquals("Отрицатеьное число недопустимо", e.getMessage());
        }
    }
}
