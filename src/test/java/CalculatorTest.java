import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorTest {

    @Test
    @DisplayName("test")
    public void sumTest_whenValue3and6_expectValue9() {
        //GIVEN
        int a = 3;
        int b = 6;


        //WHEN
        int actual = Calculator.sum(a,b);

        //THEN
        assertEquals(9,actual);
    }

    @Test
    @DisplayName("isEvenTest")
    public void isEven_whenValue3_expectValueFalse() {
        //GIVEN
        int a = 3;

        //WHEN
        boolean actual = Calculator.isEven(a);

        //THEN
        assertFalse(actual);
//        assertEquals(false,actual);
    }

    @Test
    @DisplayName("productTest")
    public void productTest_whenValue2And2_expectValue4() {
        //GIVEN
        int a = 2;
        int b = 2;

        //WHEN
        int actual = Calculator.product(a,b);

        //THEN
        assertEquals(4,actual);

    }
    @Test
    @DisplayName("toUpperCaseTest")
    public void toUpperCaseTest_whenValueHello_expectValueHELLO() {
        //GIVEN
        String a = "Hello";

        //WHEN
        String actual = Calculator.toUpperCase(a);

        //THEN
        assertEquals("HELLO",actual);

    }
    @Test
    @DisplayName("isPositiveTest")
    public void isPositiveTest_whenValue5_expectValueTrue() {
        //GIVEN
        int a = 5;

        //WHEN
        boolean actual = Calculator.isPositive(a);

        //THEN
        assertEquals(true,actual);

    }
}
