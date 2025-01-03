package techM;

import java.util.Scanner;

public class codeSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }


        int result = findTotalPieces(n, array);
        System.out.println("The answer is: " + result);
    }

    static int findTotalPieces(int n, int array[]){

        int rem =0;

        for(int i=0;i<n;i++){
            if(array[i]>=12){
                rem += array[i]/12;
            }
        }


        return rem;
    }
}
