/*Author: Jaylen Small 
Written: 10/4/24

Compilation: javac Jaylen_Small_GuessLetter.java
Execution: java Jaylen_Small_GuessLetter

Solution to the Letter Guessing assignment using loops

Sample Output:
Guess the random letter.
You get 10 guesses.
My guess is: 
a
My guess is: 
r
My guess is: 
t
My guess is: 
y
My guess is: 
j
My guess is:
g
My guess is:
f
The letter was f! You got it in 7 guesses.
Play again?
Enter 'y' to continue, 'n' to exit game
*/
import java.util.Scanner;

public class Jaylen_Small_GuessLetter {
    public static void main(String[] args) {
        // Declares all varibles for the loops to use
        Scanner input = new Scanner(System.in);
        int entryCount = 0;
        int entriesAllowed = 10;
        char userEntry;
        char computerGuess = (char)(Math.random() * 26 + 'a');

        while (true) {
            System.out.println("Guess the random letter.");
            System.out.println("You get 10 guesses.");
            // Allows a maximum of 10 guesses before a game over, if the user guesses correctly they win the game
            for(int i=0; i<entriesAllowed; i++){
                System.out.println("My guess is: ");
                userEntry = input.next().charAt(0);
                entryCount++;
                if(userEntry == computerGuess){
                    System.out.println("The letter was " + computerGuess + "! You got it in " + entryCount + " guesses.");
                    break;
                }
            }

            if(entryCount == 10){
                System.out.println("Too bad. The letter was " + computerGuess);
            }

            // Prompts the user on if they want to continue playing the game or not
            entryCount = 0;
            System.out.println("Play again?");
            System.out.println("Enter 'y' to continue, 'n' to exit game");
            userEntry = input.next().charAt(0);
            if(userEntry == 'y'){
                continue;
            } else {
                System.out.println("Thanks for playing!");
                break;
            }

        }
    }
}
