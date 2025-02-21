/*Author: Jaylen Small 
Written: 10/21/24

Compilation: javac Jaylen_Small_Exercise05_51.java
Execution: java Jaylen_Small_Exercise05_51

Solution to exercise 5-49 from the textbook

Sample Output:
Enter the first string: hating java
Enter the second string: loving java
The longest common sufix is ing java
*/

import java.util.Scanner;

public class Jaylen_Small_Exercise05_51 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two strings
    System.out.print("Enter the first string: ");
    String s1 = input.nextLine();
    System.out.print("Enter the second string: ");
    String s2 = input.nextLine();
    
    // Sets two strings, the final result and a temp result for holding the reversed string
    String result = "";
    String tempResult = "";
    
    // This loop grabs similar characters and puts them in the tempResult string starting from the end of the user strings
    for (int i = s1.length() - 1; i >= 0; i--) {
      if (s1.charAt(i) == s2.charAt(i))
        tempResult += s1.charAt(i);
      else
        break;
    }

    // This loop reverses the tempResult and stores it into the final result string
    for (int i = tempResult.length() - 1; i >= 0; i--) {
        char temp = tempResult.charAt(i);
        result += temp;
    }

    // Returns the result string is there are any characters in it
    if (result.length() > 0) {
      System.out.println("The longest common sufix is " + result);
    }
    else {
      System.out.println(s1 + " and " + s2 + " have no common sufix");
    }
  }
}
