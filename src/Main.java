//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {}

    private static int factorial(int number) { // already provided and tested. Implemented here for working purposes.
        if (number == 0) return 1;
        if (number > 0) return number * factorial(number - 1);
        else return number * factorial(number + 1);
    }

    public static int[] getFactorialFromEachMatrixRowSum(int[][] matrix) { // 1)
        //2)
        if (matrix.length == 0) return new int[0];
        int[] result = new int[matrix.length];

        int currentIndex = 0;
        for (int[] row : matrix) { // evaluator might not like enhanced for loop. To discuss.
            // evaluator didn't like this extra code that in case of sum == 0 skips the factorial recursive method.
            // I couldn't see the factorial method already implemented, so I wasn't sure that this edge case was considered.
            // 20% cut on this one. The factorial method in my code already implements solution for sum == 0.
//            int sum = getArraySum(row);
//            if (sum == 0) {
//                result[currentIndex] = 1;
//                currentIndex++;
//                continue;
//            }
            result[currentIndex] = factorial(getArraySum(row));
            currentIndex++;
        }

        return result;
    }

    private static int getArraySum(int[] array) {
        int sum = 0;
        for (int number : array) sum += number;
        return sum;
    }
}