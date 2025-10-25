public class ScientificCalculator extends AdvancedCalculator {
    // https://github.com/spumesco/Java04-Calculator-project/issues/9

    // @Override
    // public int divide() {
    //     while (true) {
    //         Calculator calc = new AdvancedCalculator();
    //     }
    // }

    public int mod() {
        // result = num1 % num2;
        // int advancedD = divide();
        // int scientficD = 0;

        int i = 0;
        // int remain = 0;

        // while (true) {
        //     if (num1 >= num2) {
        //         num1 -= num2;
        //         i++;
        //     } else if (num1 < num2) {
        //         scientficD = i;
        //         break;
        //     }
        //     return scientficD;
        // }

        // if (advancedD == scientficD) {

        int num3 = num1;

            while (true) {
                if (num3 >= num2) {
                    num3 -= num2;
                    i++;
                } else if (num3 < num2) {
                    result = num3;
                    break;
                }
            }
            // return remain;
        return result;
        }
        // return result;
    // }
}