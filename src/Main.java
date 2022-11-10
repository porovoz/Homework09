import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // homework 09 started
        // task 1
        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));
        int sum = 0;
//        for (int i = 0; i < expenses.length; i++) {
//            sum += expenses[i];
//        }
        for (int element: expenses) {
            sum += element;
        }
//       sum = Arrays.stream(expenses).sum();
        System.out.println("The amount of expenses for the month was " + sum + " rubles.");

        // task 2
        int[] expenses1 = generateRandomArray();
        System.out.println(Arrays.toString(expenses1));
        int maximumExpensesForOneDay = expenses1[0];
        int minimumExpensesForOneDay = expenses1[0];
        for (int i = 1; i < expenses1.length; i++) {
            if (expenses1[i] > maximumExpensesForOneDay) {
                maximumExpensesForOneDay = expenses1[i];
            }
        }
        for (int i = 1; i < expenses1.length; i++) {
            if (expenses1[i] < minimumExpensesForOneDay) {
                minimumExpensesForOneDay = expenses1[i];
            }
        }
        System.out.println("Minimum amount of expenses for a day was " + minimumExpensesForOneDay +
                " rubles. Maximum amount of expenses for a day was " + maximumExpensesForOneDay + " rubles.");

//        Arrays.sort(expenses1);
//        System.out.println("Minimum amount of expenses for a day was " + expenses1[0] +
//                " rubles. Maximum amount of expenses for a day was " + expenses1[expenses1.length - 1] + " rubles.");

//        int maximumExpensesForOneDay = Arrays.stream(expenses1)
//                .max()
//                .getAsInt();
//        int minimumExpensesForOneDay = Arrays.stream(expenses1)
//                .min()
//                .getAsInt();
//        System.out.println("Minimum amount of expenses for a day was " + minimumExpensesForOneDay +
//                " rubles. Maximum amount of expenses for a day was " + maximumExpensesForOneDay + " rubles.")

        // task 3
        int[] expenses2 = generateRandomArray();
        System.out.println(Arrays.toString(expenses2));
        int days = 30;
        double average = 0;
        for (float element: expenses2) {
            average += element / days;
        }
        String round = String.format("%.2f", average);
        System.out.println("Average amount of expenses for the day was " + round + " rubles.");

        // task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
