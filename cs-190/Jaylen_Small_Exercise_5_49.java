/*Author: Jaylen Small 
Written: 10/18/24

Compilation: javac Jaylen_Small_Exercise_5_49.java
Execution: java Jaylen_Small_Exercise_5_49

Solution to exercise 5-49 from the textbook

Sample Output:
Enter a string: Programming is fun
The number of vowels is: 5
The number of consonants is: 11
*/

import java.util.*;

public class Jaylen_Small_Exercise_5_49 {
    // This is a method that counts how many vowels a string has
    public static int CheckVowels(String string){
        // Variable for tracking the amount of vowels in a string
        int vowelCount = 0;
        
        /* This loop goes through each character in a string and checks for 
        characters a, e, i, o, or u. If it's on of those five, it adds to the vowelCount variable*/
        for (int i = 0; i < string.length(); i++) {
            char compare = string.charAt(i);
            if (compare == 'a' || compare == 'e' || compare == 'i' || compare == 'o' || compare == 'u'){
              vowelCount++;
            }
        }
        return vowelCount;
    }

    // This is a method that counts how many consonants a string has
    public static int CheckConsonants(String string){
        // Variable for tracking the amount of vowels in a string
        int conCount = 0;
        
        /* This loop goes through each character in a string and checks for 
        characters a, e, i, o, or u. If it's on of those five, it adds to the vowelCount variable*/
        for (int i = 0; i < string.length(); i++) {
            char compare = string.charAt(i);
            if (!(compare == 'a' || compare == 'e' || compare == 'i' || compare == 'o' || compare == 'u' || compare == ' ')){
              conCount++;
            }
        }
        return conCount;
    }

    public static void main(String[] args) {
        // Gets user imput for a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        
        // Uses the previous two methods to return the amount of vowels and consonants in the input string
        System.out.println("The number of vowels is: " + CheckVowels(userInput));
        System.out.println("The number of consonants is: " + CheckConsonants(userInput));
    }
}
