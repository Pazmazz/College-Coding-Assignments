/*Author: Jaylen Small 
Written: 9/20/24

Compilation: javac Jaylen_Small_Test1.java
Execution: java Jaylen_Small_Test1

Solution to the lab assignment from Test 1

Sample Output:
Enter an integer from 0 to 99: 56
The user's value of 56 is larger than the computer's value of 11
*/
import java.util.Scanner;
import java.lang.Math;

public class Jaylen_Small_Test1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user for their an input between 0 to 99 and stores it in the userValue variable
        System.out.print("Enter an integer from 0 to 99: ");
        int userValue = input.nextInt();

        //Generates a random number between 0 and 99
        int computerValue = (int)(Math.random() * 100);

        /*Makes sure the user's input is in the correct rage, otherwise, 
        the user value and the computer's value is compared to each other to see which is greater
        */
        if (userValue > 99){
            System.out.println("Incorrect value");
        } else if (userValue > computerValue){
            System.out.println("The user's value of " + userValue + " is larger than the computer's value of "+ computerValue);
        } else if(computerValue > userValue){
            System.out.println("The computer's value of " + computerValue + " is larger than the user's value of "+ userValue);
        } else if(computerValue == userValue){
            System.out.println("The computer's value of " + computerValue + " is equal the user's value of "+ userValue);
        }

        input.close();
    }
}