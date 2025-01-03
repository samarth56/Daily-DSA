package dailyDSA;

import com.sun.source.tree.ReturnTree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }


        int [] result = removeDup(array);
//        System.out.println("The answer is: " + result);

        for(int nu: result){
            System.out.print(nu +" ");
        }
    }
    static int [] removeDup(int array[]){

        HashSet<Integer> set = new LinkedHashSet<>();
        for(int num: array){
            set.add(num);
        }

        int [] uniqueArray = new int[set.size()];
        int i=0;
        for(int n:set){
            uniqueArray[i++]=n;
        }

        return uniqueArray;
    }
}
