package dailyDSA;
import java.util.*;

public class codeOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the start position:");
        int start = sc.nextInt();

        int result = findTotalSum(n, array, start);

        // Corrected print statement
        System.out.println("The answer is: " + result);

        sc.close(); // Close the scanner to avoid resource leak
    }

    static int findTotalSum(int n, int array[], int start) {
        int sum = 0;

        // Loop to calculate the sum of differences
        for (int i = start - 1; i < n - 1; i++) {
            sum += array[i + 1] - array[i];
        }
        return sum;
    }
}
