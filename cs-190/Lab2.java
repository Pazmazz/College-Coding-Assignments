/*Author: Jaylen Small 
Written: 9/6/24

Compilation: javac Lab2.java
Execution: java Lab2

Solution to the Lab2.6, this program reads an integer between 0 and 1000 and adds all of the digits together

Sample Output:
Enter a number betwen 0 and 1000: 234
The sum of digits is: 9
*/
import java.util.Scanner;

public class Lab2 {
    static int getSumOfDigits(String str){
        // the variable that stores the sum of the digits
        int sum = 0;

        /* 
         * For loop that iterates as many times as the input string is 
         * long to extract each character from the input string 
         * individually and convert it to an integer
        */
        for(int i = 0; i < str.length(); i++){
            char d = str.charAt(i);

            if (Character.isDigit(d) == true){
                sum += Character.getNumericValue(d);
            }
        }

        // return the sum
        return sum;
    }
    public static void main(String[] args){
        // create the input object
        Scanner input = new Scanner(System.in);

        // prompt the user for an integer value between 0 and 100
        System.out.print("Enter a number betwen 0 and 1000: ");
        String numInput = input.next();

        if (numInput.length() > 3){
            System.out.print("Enter a number betwen 0 and 1000: ");
            input.close();
            return;
        }

        // gets the sum of the digits from the input
        int sumOfDigits = getSumOfDigits(numInput);

        System.out.println("The sum of digits is: " + sumOfDigits);

        input.close();
    }
}
