/*Author: Jaylen Small 
Written: 10/11/24

Compilation: javac Jaylen_Small_ErrorDetection.java
Execution: java Jaylen_Small_ErrorDetection

Solution to the lab 7 assignment

Sample Output:
Enter 14-digit card number: 58667936100244
Length correct
Characters correct
Odd sum = 25
Even sum = 35
Card valid

Enter 14-digit card number: 58667736100244
Length correct
Characters correct
Odd sum = 25
Even sum = 33
Card invalid
*/
import java.util.Scanner;

public class Jaylen_Small_ErrorDetection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddDigit = 0; 
        int evenDigit = 0;

        // Gets card input from user
        System.out.print("Enter 14-digit card number: ");
        String cardNum = input.next();

        // Checks to see if the card number is 14 characters long
        if (cardNum.length() > 14 || cardNum.length() < 14){
            System.out.println("Length incorrect");
        } else {
            System.out.println("Length correct");
        }
        
        // Checks to see if all the character inputs are digits
        boolean allDigits = true;
        for (int i = 0; i < 13; i++){
            if (!Character.isDigit(cardNum.charAt(i))) {
                allDigits = false;
                System.out.println("Characters incorrect");
                break;
            }
        }

        if (allDigits == true) {
            System.out.println("Characters correct");
        }

        /* A loop that muliplies every number in an odd digit position by 2 
        and subtracts double digit numbers by 9 and eventually adds it all together */
        for (int i = 0; i < cardNum.length(); i++){
            int tempOddDigit = 2 * (cardNum.charAt(i) - 48);
            if (tempOddDigit > 9){
                tempOddDigit = tempOddDigit - 9;
            }
            oddDigit += tempOddDigit;
            i++;
        }
        System.out.println("Odd sum = " + oddDigit);

        // A loop that adds every number in an even digit position
        for (int i = 1; i < cardNum.length(); i++){
            int tempEvenDigit = (cardNum.charAt(i) - 48);
            evenDigit += tempEvenDigit;
            i++;
        }
        System.out.println("Even sum = " + evenDigit);

        int cardValid = oddDigit + evenDigit;

        // Makes sure the sum of the even and odd digits is a multiple of 10
        if (cardValid % 10 == 0){
            System.out.println("Card valid");
        } else {
            System.out.println("Card invalid");
        }
    }
}
