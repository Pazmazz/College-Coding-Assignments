/*Author: Jaylen Small 
Written: 9/29/24

Compilation: javac Jaylen_Small_AccessCode.java
Execution: javac Jaylen_Small_AccessCode

Solution to the Access code assignment using strings

Sample Output:
Random Access Code
DOQ148-SJTZV-LSQEF-DLRZI-RZSOV
*/
public class Jaylen_Small_AccessCode {
    public static void main(String[] args) {
        // Setting up 25 different variables to each generate an indivdual uppercase character
        char one = (char)(Math.random() * 26 + 'A');
        char two = (char)(Math.random() * 26 + 'A');
        char three = (char)(Math.random() * 26 + 'A');
        char four = (char)(Math.random() * 26 + 'A');
        char five = (char)(Math.random() * 26 + 'A');

        
        char six = (char)(Math.random() * 26 + 'A');
        char seven = (char)(Math.random() * 26 + 'A');
        char eight = (char)(Math.random() * 26 + 'A');
        char nine = (char)(Math.random() * 26 + 'A');
        char ten = (char)(Math.random() * 26 + 'A');

        
        char eleven = (char)(Math.random() * 26 + 'A');
        char twelve = (char)(Math.random() * 26 + 'A');
        char thirteen = (char)(Math.random() * 26 + 'A');
        char forteen = (char)(Math.random() * 26 + 'A');
        char fifteen = (char)(Math.random() * 26 + 'A');

        
        char sixteen = (char)(Math.random() * 26 + 'A');
        char seventeen = (char)(Math.random() * 26 + 'A');
        char eighteen = (char)(Math.random() * 26 + 'A');
        char nineteen = (char)(Math.random() * 26 + 'A');
        char twenty = (char)(Math.random() * 26 + 'A');

        
        char twentyOne = (char)(Math.random() * 26 + 'A');
        char twentyTwo = (char)(Math.random() * 26 + 'A');
        char twentyThree = (char)(Math.random() * 26 + 'A');
        char twentyFour = (char)(Math.random() * 26 + 'A');
        char twentyFive = (char)(Math.random() * 26 + 'A');
        
        //Puts all of the characters into one string to print out
        String code = (four + five + "-" 
        + six + seven + eight + nine + ten + "-" 
        + eleven + twelve + thirteen + forteen + fifteen + "-"
        + sixteen + seventeen + eighteen + nineteen + twenty + "-" 
        + twentyOne + twentyTwo + twentyThree + twentyFour + twentyFive);

        //Separates the first two characters so they print out as letters instead of numbers
        String newCode = "";

        newCode += one;
        newCode += two;
        newCode += three;

        //Prints out a random access code
        System.out.println("Random Access Code");
        System.out.println(newCode + code);       
    }
}
