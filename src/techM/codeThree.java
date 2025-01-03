package techM;
import java.util.*;

public class codeThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }


        float result = findTotalInterest(n, array);

        System.out.println("The answer is: " + result);    }


    static float findTotalInterest(int n, int array[]) {

        float sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 2000) {
                sum += (array[i] * 20) / 100;
//                System.out.println(sum);
            }
        }

        return sum;

    }
}
