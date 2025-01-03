package dailyDSA;
import java.util.*;

public class codeNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int result[] = maxProd(arr);

        System.out.println("the answer is:" + Arrays.toString(result));

    }

    static int[] maxProd(int arr[]){

        Arrays.sort(arr);

        int n= arr.length;

        int prod1 = arr[0]*arr[1];
        int prod2 = arr[n-1]*arr[n-2];

        if(prod1>prod2){
            return new int[] {arr[0], arr[1]};
        }else {
            return new int[] {arr[n-1], arr[n-2]};
        }


    }
}
