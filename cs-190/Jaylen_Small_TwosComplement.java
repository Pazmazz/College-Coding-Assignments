/*
 * Author: Jaylen Small
 * Written: 10/29/24
 * 
 * Discription: Solution to the twos complement assignment
 */

import java.util.Scanner;

public class Jaylen_Small_TwosComplement {
    // Declares two public variables for the two final sums
    public static int finalSum = 0;
    public static int finalSum2 = 0;

    // Evaluation method for negative binaries
    public static void EvaluationNeg(String s){
        // Declares all variables for this method
        char binaryDigit;
        int numericBinary;
        String reverseBinaryNum = "";
        double binaryResult = 0;
        int sum = 0;
        double temp = 0;
        int tempSum = 0;

        // For loop that reverses the string and puts it in a separate string
        for (int i = s.length() - 1; i >= 0; i--){
            binaryDigit = s.charAt(i);
            reverseBinaryNum += binaryDigit;
        }

        // For loop that raises 2 to the power of whatever position zero characters are in in the string and adds all the results together
        for (int i = 0; i < reverseBinaryNum.length(); i++){
            binaryDigit = reverseBinaryNum.charAt(i);
            numericBinary = Character.getNumericValue(binaryDigit);
            if (numericBinary == 0){
                binaryResult = Math.pow(2, i);
                if (i > 0){
                    tempSum = (int)(temp + binaryResult);
                    temp = tempSum;
                 } else {
                     temp = binaryResult;
                 }
            }
                
        }

        // Adds one to the sum and makes the sum a negative number
        sum = tempSum + 1;
        sum = sum * -1;

        // Prints result, and sets the final sum variable equal to the sum
        System.out.println(s + " = " + sum);

        if (finalSum > 0){
            finalSum2 = sum;
        } else {
            finalSum = sum;
        }
    }

    public static void Evaluation(String s){
        // Declares all variables for this method
        char binaryDigit;
        int numericBinary;
        String reverseBinaryNum = "";
        int sum;
        double temp = 0;
        int tempSum = 0;

        // For loop that reverses the string and puts it in a separate string
        for (int i = s.length() - 1; i >= 0; i--){
            binaryDigit = s.charAt(i);
            reverseBinaryNum += binaryDigit;
        }

        /* For loop that raises 2 to the power of whatever position each characters are in, multiplies it by the binary character
        and adds all the results together */
        for (int i = 0; i < reverseBinaryNum.length(); i++){
            binaryDigit = reverseBinaryNum.charAt(i);
            numericBinary = Character.getNumericValue(binaryDigit);
            double binaryResult = numericBinary * Math.pow(2, i); 
            if (i > 0){
               tempSum = (int)(temp + binaryResult);
               temp = tempSum;
            } else {
                temp = binaryResult;
            }
        }

        sum = tempSum;

        // Prints result, and sets the final sum variable equal to the sum
        System.out.println(s + " = " + "+" + sum);
        finalSum = sum;

        if (finalSum > 0){
            finalSum2 = sum;
        } else {
            finalSum = sum;
        }
    }

    public static void ConditionCheck(String s){
        // If the first character is a 1, evaluate for a negative number, otherwise, solve normally
        if (s.charAt(0) == '1'){
            EvaluationNeg(s);
        } else {
            Evaluation(s);
        }
    }

    public static void Range(int w){
        // Raises 2 to the power of the word size minus 1 to determine the range
        double lowerRange = (int)(-Math.pow(2, w - 1));
        double upperRange = (int)Math.pow(2, w - 1) - 1;

        // Adds to the two final sums together
        int sums = finalSum + finalSum2;

        // If the sum does not fit within the range, an error message is printed
        if (sums < lowerRange || sums > upperRange){
            System.out.println("Wordsize will not accomodate the sum.");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sets a character limit for the next two inputs
        System.out.print("Enter word size: ");
        int wordSize = input.nextInt();

        System.out.print("Enter first binary number: ");
        String binaryNum = input.next();

        // Makes sure the user input isn't greater than the character limit
        if (binaryNum.length() > wordSize){
            System.out.println("Invalid input");
            System.exit(0);
        } else {
            ConditionCheck(binaryNum);
        }

        System.out.print("Enter second binary number: ");
        String binaryNum2 = input.next();

        // Makes sure the user input isn't greater than the character limit
        if (binaryNum2.length() > wordSize){
            System.out.println("Invalid input");
            System.exit(0);
        } else {
            ConditionCheck(binaryNum2);
        }
        Range(wordSize);
    }
}
