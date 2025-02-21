/*Author: Jaylen Small 
Written: 10/4/24

Compilation: javac Jaylen_Small_RPS.java
Execution: java Jaylen_Small_RPS

Solution to the Rock-Paper-Scissors assignment using switch staements

Sample Output:
Select your object to play.
Enter R for rock
Enter P for paper
Enter S for scissors
Choose your object to play: r
You selected r
Computer selected s
The winner is: user
*/
import java.util.Random;
import java.util.Scanner;

public class Jaylen_Small_RPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select your object to play.");
        System.out.println("Enter R for rock");
        System.out.println("Enter P for paper");
        System.out.println("Enter S for scissors");
        System.out.print("Choose your object to play: ");
        String userInput = input.next();

        // Sorts out an array of 3 different choices for the computer to randomly select from
        char[] randomCharacters = {'r', 'p', 's'};

        Random random = new Random();
        int computerRandom = random.nextInt(randomCharacters.length);
        char computerInput = randomCharacters[computerRandom];

        System.out.println("You selected " + userInput);
        System.out.println("Computer selected " + computerInput);
        
        // Compares the users choice the computer's choice and exvaluates who won from there.
        switch (userInput) {
            case "r":
                if (computerInput == 'p'){
                    System.out.println("The winner is: computer");
                } else if (computerInput == 's') {
                    System.out.println("The winner is: user");
                } else {
                    System.out.println("The winner is: tie");
                }
                break;
        
            case "p":
                if (computerInput == 'r'){
                    System.out.println("The winner is: user");
                } else if (computerInput == 's') {
                    System.out.println("The winner is: computer");
                } else {
                    System.out.println("The winner is: tie");
                }
                break;
            
            case "s":
                if (computerInput == 'r'){
                    System.out.println("The winner is: computer");
                } else if (computerInput == 'p') {
                    System.out.println("The winner is: user");
                } else {
                    System.out.println("The winner is: tie");
                }
                break;
        }
    
        input.close();
    }
}
