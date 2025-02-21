import java.util.Scanner;

public class quadratic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is value a?");
        double a = input.nextDouble();

        System.out.println("What is value b?");
        double b = input.nextDouble();

        System.out.println("What is value c?");
        double c = input.nextDouble();

        QuadraticFormula(a, b, c);
    }

    public static void QuadraticFormula(double a, double b, double c){
        double firstPart = Math.pow(b, 2) - b * a * c;

        double secondPart = 2 * a;

        System.out.println(firstPart);
    }
}