/*Author: Jaylen Small 
Written: 10/23/24

Solution to the password check assignemnt on blackboard
*/

public class Jaylen_Small_PasswordCheck {
    // isValidPassword method that checks to see if a password is valid
    public static boolean isValidPassword(String string){
        // A validation counter that needs to stay 0 in order the password to be valid
        int validCounter = 0;
        
        // Initializes digitCount and stringChar variables
        int digitCount = 0;
        char stringChar;

        // For loop that checks each character in the string
        for (int i = 0; i < string.length(); i++){
            stringChar = string.charAt(i);
            boolean hasDigit = Character.isDigit(stringChar);
            boolean hasLetter = Character.isLetter(stringChar);
            
            // If the string length is greater than 8(7 java charcters) it substracts from the validation counter and breaks out the loop
            if (i > 7){
                validCounter--;
                break;
            } 
            
            // If the character is neither a number or character, it substracts from the validation counter and breaks out the loop
            if (!(hasDigit || hasLetter)){
                validCounter--;
                break;
            }

            // Counts how many digits are in the string, if it's more than 2 it substracts from the validation counter and breaks out the loop
            if (hasDigit == true){
                digitCount++;
            }

            if (digitCount > 2){
                validCounter--;
                break;
            }
        }

        // If the validation counter stays 0, the password is valid, otherwise it's invalid
        if(validCounter < 0){
            return false;
        } else {
            return true;
        }
    }
    
    public static void main(String[] args) {
        // Prompt the user to enter a password
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string for password: ");
        String s = input.nextLine();
    
        if (isValidPassword(s) == true) {
          System.out.println("Valid Password");
        }
        else {
          System.out.println("Invalid Password");
        }
    }
}
