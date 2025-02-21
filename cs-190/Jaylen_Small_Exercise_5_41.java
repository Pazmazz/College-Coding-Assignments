/*Author: Jaylen Small 
Written: 10/18/24

Compilation: javac Jaylen_Small_Exercise_5_41.java
Execution: java Jaylen_Small_Exercise_5_41

Solution to exercise 5-41 from the textbook

Sample Output:
Enter numbers: 3525550
The largest number is: 5
The occurence count of the largest number is: 4
*/

import java.util.*;

public class Jaylen_Small_Exercise_5_41 {
    public static void main(String[] args) {
      // Initializes variables max and count and the scanner object
      int max; 
      int count = 0;
      Scanner input = new Scanner(System.in);

      // Gets user imput foe a string of numbers
      System.out.print("Enter numbers: ");
      String numbers = input.next();

      // Checks character position in a string and converts it to a numeric value
      max = Character.getNumericValue(numbers.charAt(0));

      /* This loop compares each character position to the max variable.
      If character is greater than the max, then it become the new max variable */
      for (int i = 0; i < numbers.length(); i++) {
          int compare = Character.getNumericValue(numbers.charAt(i));
          if (compare > max){
            max = compare;
          }
      }

      // This loop counts to see how often the max variable appears in the number string
      for (int i = 0; i < numbers.length(); i++) {
        int compare = Character.getNumericValue(numbers.charAt(i));
        if (compare == max){
          count++;
        }
      }

      // Returns what the max vaule in the number string is and the amount of times it appears in the number string
      System.out.println("The largest number is: " + max);
      System.out.println("The occurence count of the largest number is: " + count);
      }
}
