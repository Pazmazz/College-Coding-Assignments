/*Author: Jaylen Small 
Written: 11/5/24

Compilation: javac Jaylen_Small_Exercise_7_30.java
Execution: java Jaylen_Small_Exercise_7_30

Solution to exercise 7-30 from the textbook

Sample Output:
Enter the number of values: 8
Enter the values: 3 4 5 5 5 5 4 5
The list has consecutive fours
*/
import java.util.*;

public class Jaylen_Small_Exercise_7_30 {
    // Method that compares each consecutive number in an array
    public static boolean Compare(int[] array){
        // Sets variables
        int occurenceCount = 0;
        int compare = 0;

        // For loop that that compares each consecutive number in an array
        for (int i = 0; i < array.length; i++){
            int temp = array[i];
            // If the compare and temp varible are equal add the occurence count
            if (compare == temp){
                compare = temp;
                occurenceCount++;
            } else {
                compare = temp;
                occurenceCount = 0;
            }

            // If the occrence count is 3(meaing 4 in a row) break out the loop
            if (occurenceCount == 3){
                break;
            }
        }

        // If the occurence is 3(or 4 in a row) return true
        if (occurenceCount == 3){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayList = {};

        // Grabs user input for the number of values
        System.out.print("Enter the number of values: ");
        int maxValue = input.nextInt();

        // Grabs user input
        System.out.print("Enter the values: ");
        int values = input.nextInt();

        // Sets the the max character length to the first character in the number string and adds each integer after to the array
        if (maxValue > 0){
            int max = maxValue;
            arrayList = new int[max];
            arrayList[0] = values;

            for (int i = 1; i < arrayList.length; i++){
                arrayList[i] = input.nextInt();
            }
        }

        // Prints results based on ehat the equals method returns
        if (Compare(arrayList)){
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }
}
