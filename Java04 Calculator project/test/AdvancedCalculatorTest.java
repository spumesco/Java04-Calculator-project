import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// https://github.com/spumesco/Java04-Calculator-project/issues/6

class AdvancedCalculatorTest {
    AdvancedCalculator advancedCalc;

    @BeforeEach
    void setUp() {
        advancedCalc = new AdvancedCalculator();
        advancedCalc.setNumbers(9, 3);
    }

    @Test
    void multiply() {
        assertEquals(27, advancedCalc.multiply());
        }

    @Test
    void divide() {
        assertEquals(3, advancedCalc.divide());
    }
}