/*Author: Jaylen Small 
Written: 9/13/24

Compilation: javac Jaylen_Small_IncomeTax.java
Execution: java Jaylen_Small_IncomeTax

Solution to the Fedral Income tax assignment using logical operators

Sample Output:
Enter annual income to nearest dollar: 89395
Income: 89395.0 Tax: 15744.3
*/
import java.util.Scanner;

class Jaylen_Small_IncomeTax{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Asks user for their income tax
        System.out.print("Enter annual income to nearest dollar: ");

        double income = input.nextDouble();

        // Checks the range of the users income tax and performs the appropriate formula
        if (income > 0 && income <= 9525){
            double tax = income * 0.10;
            System.out.println("Income: " + income + " Tax: " + tax);
        }

        if (income > 9525 && income <= 38700){
            double tax = 952.50 + (income - 9525) * 0.12;
            System.out.println("Income: " + income + " Tax: " + tax);
        }

        if (income > 38700 && income <= 82500){
            double tax = 4453.55 + (income - 38700) * 0.22;
            System.out.println("Income: " + income + " Tax: " + tax);
        }

        if (income > 82500 && income <= 157500){
            double tax = 14089.50 + (income - 82500) * 0.24;
            System.out.println("Income: " + income + " Tax: " + tax);
        }

        if (income > 157500 && income <= 200000){
            double tax = 32089.50 + (income - 157500) * 0.32;
            System.out.println("Income: " + income + " Tax: " + tax);
        }

        if (income > 200000 && income <= 500000){
            double tax = 45689.50 + (income - 200000) * 0.35;
            System.out.println("Income: " + income + " Tax: " + tax);
        }

        if (income > 500000){
            double tax = 150689.50 + (income - 500000) * 0.37;
            System.out.println("Income: " + income + " Tax: " + tax);
        }

        input.close();
    }
}