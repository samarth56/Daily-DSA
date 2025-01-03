package dailyDSA;

import java.util.Scanner;

public class codeEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }


        int result = findTax(n, array);
        System.out.println("The answer is: " + result);
    }

    static int findTax(int n, int array[]){

        int totalTax = 0;
        int threshold = 1000;

        for(int i=0;i<n;i++){
            if(array[i]>threshold){
                totalTax += ((array[i]-threshold) *10)/100;
            }
        }


        return totalTax;
    }
}
