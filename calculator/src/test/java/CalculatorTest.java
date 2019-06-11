import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {calculator = new Calculator(10, 5);}

    @Test
    public void hasAdd() {
        assertEquals(15.0, calculator.getAdd());
    }
    @Test
    public void hasMultiply(){
        assertEquals(50.0, calculator.getMultiply());
    }
    @Test
    public void hasSubtract(){
        assertEquals(5.0, calculator.getSubtract());
    }
    @Test
    public void hasDivide(){
        assertEquals(2.0, calculator.getDivide());
    }


}
