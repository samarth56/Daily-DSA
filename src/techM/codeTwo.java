package techM;
import java.util.*;


public class codeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }


        int result = findTotalPieces(n, array);

        System.out.println("The answer is: " + result);    }

    static int findTotalPieces(int n , int array[]){
        int  sum=0;

        for(int i=0;i<array.length;i++){
            sum += array[i]/10;
        }

        return sum;

    }
}
