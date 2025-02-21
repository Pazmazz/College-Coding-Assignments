/*Author: Jaylen Small 
Written: 9/13/24

Compilation: javac Jaylen_Small_ArmstrongNumber.java
Execution: java Jaylen_Small_ArmstrongNumber

Solution to the Armstrong Numbers assignment using numeric operators

Sample Output:
Please enter a 3 digit number to determine if it is an Armstrong number: 153
Number: 153 is an Armstrong number
*/
import java.util.Scanner;

public class Jaylen_Small_ArmstrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Asks user for a 3 digit integer and saves it as an integer
        System.out.print("Please enter a 3 digit number to determine if it is an Armstrong number: ");

        int armstrongNumber = input.nextInt();

        // Divides the input by 10 3 different times and isolates the reminder each time to split up the three digit number
        int firstRemainder = armstrongNumber % 10;
        int firstDivison = armstrongNumber / 10;
        
        int secondRemainder = firstDivison % 10;
        int secondDivison = firstDivison / 10;
        
        int thirdRemainder = secondDivison % 10;

        // Raises each remainder to the power of 3
        int firstSquared = (int)Math.pow(firstRemainder, 3);
        int secondSquared = (int)Math.pow(secondRemainder, 3);
        int thirdSquared = (int)Math.pow(thirdRemainder, 3);
        
        // Checks to see if the sum of all the cubes equals the original input
        if (firstSquared + secondSquared + thirdSquared == armstrongNumber){
            System.out.println("Number: " + armstrongNumber + " is an Armstrong number");
        } else{
            System.out.println("Number: " + armstrongNumber + " is not an Armstrong number");
        }

        input.close();
    
    }
}
