/*Author: Jaylen Small 
Written: 11/5/24

Compilation: javac Jaylen_Small_Exercise_7_26.java
Execution: java Jaylen_Small_Exercise_7_26

Solution to exercise 7-26 from the textbook

Sample Output:
Enter list1: 5 2 5 6 1 6
Enter list2: 5 2 5 6 1 6
Two lists are strictly identical
*/
import java.util.*;

public class Jaylen_Small_Exercise_7_26 {
    
    // Method for comparing arrays
    public static boolean Equals(int[] list1, int[] list2){
        // A variable for counting shared numbers in each string
        int idCount = 0;

        // For loop that compares elements in both arrays, if equal they add to the id count
        for (int i = 1; i < list1.length; i++){
            int compare = list1[i];
            int compare2 = list2[i];

            if (compare == compare2){
                idCount++;
            }
        }

        // If the id count is equal to the array length then the function returns true
        if (idCount >= list1.length - 1){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        // Sets up variables
        Scanner input = new Scanner(System.in);
        int[] arrayList = {};
        int[] arrayList2 = {};
        int max = 0;
        
        // Grabs user input
        System.out.print("Enter list1: ");
        int list1 = input.nextInt();

        // Sets the the max character length to the first character in the number string and adds each integer after to the array
        if (list1 > 0){
            max = list1;
            arrayList = new int[max];

            for (int i = 0; i < arrayList.length; i++){
                arrayList[i] = input.nextInt();
            }
        }
        
        // Grabs user input
        System.out.print("Enter list2: ");
        int list2 = input.nextInt();

        // Sets the the max character length to the first character in the number string and adds each integer after to the array
        if (list2 > 0){
            max = list2;
            arrayList2 = new int[max];

            for (int i = 0; i < arrayList2.length; i++){
                arrayList2[i] = input.nextInt();
            }
        }

        // Prints results based on ehat the equals method returns
        if (Equals(arrayList, arrayList2)){
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are NOT strictly identical");
        }
    }
}
