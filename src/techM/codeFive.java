package techM;
import java.util.*;


public class codeFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Take the string
        System.out.println("Enter the string:");
        String compString = sc.nextLine();

        // Call the function to get the count of non-repeated characters
        int result = countNonRepeatedCharacters(compString);

        // Output the result
        System.out.println("The count of non-repeated characters is: " + result);
    }

    static int countNonRepeatedCharacters(String compString) {
        // Logic for finding non-repeated characters goes here

        HashMap<Character, Integer> charFrequency = new HashMap<>();

        for(char c: compString.toCharArray()){
            charFrequency.put(c, charFrequency.getOrDefault(c,0)+1);
        }

        int count = 0;


        for(Map.Entry<Character,Integer> entry: charFrequency.entrySet()){
            if(entry.getValue()==1){
                count++;
            }
        }

        return count;
    }
}
