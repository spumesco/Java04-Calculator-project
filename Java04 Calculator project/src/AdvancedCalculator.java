public class AdvancedCalculator extends Calculator {
    // https://github.com/spumesco/Java04-Calculator-project/issues/3
    // https://github.com/spumesco/Java04-Calculator-project/issues/5

    @Override
    public int multiply(){
        result = num1 * num2;
        return result;
    }

    @Override
    public int divide(){
        result = num1 / num2;
        return result;
    }
}