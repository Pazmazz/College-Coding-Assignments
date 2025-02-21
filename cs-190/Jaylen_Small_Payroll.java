/*Author: Jaylen Small 
Written: 9/29/24

Compilation: javac Jaylen_Small_Payroll.java
Execution: javac Jaylen_Small_Payroll

Solution to the 4.23 lab assignment

Sample Output:
Enter employee's name: Smith
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate: 0.20
Enter state tax withholding rate: 0.09
Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $9.75
Gross Pay: 97.5
Deductions:
    Federal Withholding (20.0%%) : 19.5
    State Withholding(9.0%%) : 8.775
    Total Decutions: 28.275
Net Pay: 69.225
*/
import java.util.Scanner;

public class Jaylen_Small_Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Grabs input from user and stores it in a variable
        System.out.print("Enter employee's name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();

        //Calculates gross pay, how much federal and state withholds and it's total deductions, and net, take home pay
        double grossPay = (hourlyRate * hoursWorked);

        double federalWithholding = (grossPay * federalRate);
        double stateWithholding = (grossPay * stateRate);

        double totalDeductions = (federalWithholding + stateWithholding);
        double netPay = (grossPay - totalDeductions);

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyRate);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deductions:");
        System.out.println("    Federal Withholding (" + federalRate*100 + "%%) : " + federalWithholding);
        System.out.println("    State Withholding(" + stateRate*100 + "%%) : " + stateWithholding);
        System.out.println("    Total Decutions: " + totalDeductions);

        System.out.printf("Net Pay: " + netPay);

        input.close();
    }
}
