public class ScientificCalculator extends AdvancedCalculator {
    public int mod() {
        // result = num1 % num2;
        // int advancedD = divide();
        // int scientficD = 0;

        int i = 0;
        int remain = 0;

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
            while (true) {
                if (num1 >= num2) {
                    num1 -= num2;
                    i++;
                } else if (num1 < num2) {
                    remain = num1;
                    break;
                }
            }
            return remain;
        }
        // return result;
    // }
}