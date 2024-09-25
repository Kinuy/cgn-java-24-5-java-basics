import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void sumTest_whenValue3and6_expectValue9() {
        //GIVEN
        int a = 3;
        int b = 6;

        //WHEN
        int actual = Calculator.sum(a,b);

        //THEN
        assertEquals(9,actual);
    }
}
