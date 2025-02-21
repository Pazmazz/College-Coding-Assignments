import java.util.*;
public class Delta_Porta_Table {
    public static char[][] getKeywordPhrasePairs(String message, String keyword){
        // Initializes the keyword string, where the keyword will be copied into it until the string length is equal to that of the message string
        String keywordString = "";

        char[][] keywordPairs = new char[message.length()][2];

        keyword = keyword.toLowerCase();
        message = message.toLowerCase();
        
        // For loop that copies the original keyword into the keyword string that is the same length of the original message
        for (int i = 0; i < message.length();){
            for (int j = 0; j < keyword.length() + 2;){
                // If the keyword string length is equal to the message length, the loop breaks
                if (keywordString.length() == message.length()){
                    break;
                }
                
                /* Checks to see if the character is a letter, if not, 
                it does not need to be encrypted and is copied directly from the message string into
                the keyword string */
                // Otherwise the keyword character at "j" position is copied into the keyword string and increments the "j" variable
                if (!Character.isLetter(message.charAt(i))){
                    keywordString += message.charAt(i);
                } else {
                    keywordString += keyword.charAt(j);
                    j++;
                }
                
                // If variable j is equal to the keyword length, it is reset so it can start from the begining of the keyword
                if (j == keyword.length()){
                    j = 0;
                }
                // Variable "i" is always incremented through each loop no matter what
                i++;
            }
        }

        // For loop that pairs the characters of the keywordString and the message into an array
        for (int i = 0; i < keywordPairs.length; i++){
            // Copies each letter of the message string along the first column
            keywordPairs[i][0] = message.charAt(i);
            // Copies each letter of the keyword string string along the second column
            keywordPairs[i][1] = keywordString.charAt(i);
        }

        return keywordPairs;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get user input for the message
        System.out.print("Enter message: ");
        String message = input.nextLine();

        // Gets user input for the keyword
        System.out.print("Enter keyword: ");
        String keyword = input.nextLine();

        getKeywordPhrasePairs(message, keyword);
    }
}
