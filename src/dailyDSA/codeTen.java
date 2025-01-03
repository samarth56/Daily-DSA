package dailyDSA;
import java.util.*;

public class codeTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the data as an integer
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        // Calculate the security key
        int securityKey = findSecurityKey(data);

        // Output the result
        System.out.println("The security key is: " + securityKey);
    }

    static int findSecurityKey(int data){

        //125225
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        while(data>0){
            int digit = data %10;
            hm.put(digit, hm.getOrDefault(digit,0)+1);
            data /=10;
        }

        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()>1){
                sum++;
            }
        }

        return sum;
    }
}
