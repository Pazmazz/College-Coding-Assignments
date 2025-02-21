/*Author: Jaylen Small 
Written: 9/20/24

Compilation: javac Jaylen_Small_GeometricFigures.java
Execution: java Jaylen_Small_GeometricFigures

Solution to the geometric figures lab assignment that calculates the volume of a geometric shape

Sample Output:
Enter an integer from 0 to 99: 56
The user's value of 56 is larger than the computer's value of 11
*/
import java.util.Scanner;
import java.lang.Math;

public class Jaylen_Small_GeometricFigures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sets a constant for the value of pi
        final double PI = 3.14159265359;

        // Ask user to select between three different shapes and stores the number in the figureNumber variable
        System.out.print("Compute volume of selected figure\n 1. Cylinder\n 2. Sphere\n 3. Cone\n");
        int figureNumber = input.nextInt();

        // Gives an error message if the input is anything other than either 1, 2 or 3
        if (figureNumber <= 0 || figureNumber > 3){
            System.out.println("Invalid selection");
        }

        // Calculates the volume of the chosen figure
        switch (figureNumber) {
            case 1:
                System.out.print("Enter radius of cylinder: ");
                double cylinderRadius = input.nextDouble();
                
                System.out.print("Enter height of cylinder: ");
                double cylinderHeight = input.nextDouble();

                double cylinderVolume = PI * Math.pow(cylinderRadius, 2) * cylinderHeight;
                
                System.out.print("Cylinder volume = " + cylinderVolume);
                break;
            
            case 2:
                System.out.print("Enter radius of sphere: ");
                double sphereRadius = input.nextDouble();

                double sphereVolume = 4.0/3 * PI * Math.pow(sphereRadius, 3);
                
                System.out.print("Sphere volume = " + sphereVolume);
                break;
            
            case 3:
                System.out.print("Enter radius of cone: ");
                double coneRadius = input.nextDouble();
                
                System.out.print("Enter height of cone: ");
                double coneHeight = input.nextDouble();

                double coneVolume = 1.0/3 * PI * Math.pow(coneRadius, 2) * coneHeight;
                
                System.out.print("Cone volume = " + coneVolume);
                break;
        }

        input.close();
    }
}
