import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// https://github.com/spumesco/Java04-Calculator-project/issues/10

class ScientificCalculatorTest {
    @Test
    void mod() {
        ScientificCalculator ScientificCalc = new ScientificCalculator();
        ScientificCalc.setNumbers(100, 9);
        assertEquals(1, ScientificCalc.mod());
    }
}