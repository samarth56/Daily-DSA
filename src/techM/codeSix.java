package techM;
import java.util.*;

public class codeSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findDifference(n, arr));
    }

    static int findDifference(int n, int arr[]){

        int evenSum=0;
        int oddSum=0;
        int diff =0;


        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                evenSum += arr[i];
            }else{
                oddSum += arr[i];
            }
        }

        diff = Math.abs(evenSum-oddSum);

        return diff;

    }
}
