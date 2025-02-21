/*Author: Jaylen Small 
Written: 9/6/24

Compilation: javac Lab4.java
Execution: java Lab4

Solution to the Lab2.17, this program calculates the wind-chill temperature using the following formula:

twe = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16

Sample Output:
Enter the temperature in Fahrenheit between -58F and  41F: 5.3
Enter the wind speed (>=2) in miles per hour: 6
The wind chill index is -5.567068455881625
*/
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter the temperature in Fahrenheit between -58F and  41F: ");

        double tempInput = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");

        double windVol = input.nextDouble();

        // The formula that calculates the wind chill speed and prints the output
        double windChill = (35.74 + 0.6215 * tempInput - 35.75 * Math.pow(windVol, 0.16) + 0.4275 * tempInput * Math.pow(windVol, 0.16));

        System.out.print("The wind chill index is " + windChill);

        input.close();
    }
}
