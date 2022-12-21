import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void testAdd() {
        System.out.println("Testing Add");
        assertEquals(15, calc.add(1,2,3,4,5));
    }

    @Test
    public void testSub() {
        System.out.println("Testing Subtraction");
        assertEquals(10, calc.sub(30,20));
    }

    @Test
    public void testMultiply() {
        System.out.println("Testing Multiplication");
        assertEquals(120, calc.multiply(1,2,3,4,5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDiv() {
        System.out.println("Testing Division");
        assertEquals(2, calc.div(6,3));
        calc.div(6, 0);
    }

}