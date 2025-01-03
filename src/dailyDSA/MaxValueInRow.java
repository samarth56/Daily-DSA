package dailyDSA;

import java.util.Scanner;

public class MaxValueInRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows");
        int n = sc.nextInt();

        System.out.println("enter the number of columns");
        int m = sc.nextInt();

        int[][] arr = new int [n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int [] maxValue = getMaxValueInRow(arr);

        for(int max : maxValue){
            System.out.print(max);
        }

    }

    static int [] getMaxValueInRow(int arr[][]){

        int n = arr.length;
        int [] maxV= new int[n];

        for(int i=0;i<n;i++){
            int max = Integer.MIN_VALUE;

            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }

            maxV[i] = max;

        }

        return maxV;

    }
}
