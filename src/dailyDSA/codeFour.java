package dailyDSA;
import java.util.*;

public class codeFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }


        float result = oddEvenDiff(n, array);

        System.out.println("The answer is: " + result);
    }

    static int oddEvenDiff(int n, int array[]){

        int odd=0;
        int even =0;
        int diff = 0;

        for(int i=0;i<array.length;i++){

            if(array[i]%2==0){
                even+= array[i];
            }else{
                odd+=array[i];
            }
        }

        diff = odd - even;

        return diff;

    }
}
