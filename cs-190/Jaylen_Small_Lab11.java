/*Author: Jaylen Small 
Written: 11/10/24

Compilation: javac Jaylen_Small_Lab11.java
Execution: java Jaylen_Small_Lab11

Solution to the 2d array manipulation exercise

Sample Output:
Input values: 4 5
81 3 14 39
49 13 35 69
28 15 67 76
19 71 33 26
1: Swap two random rows
2: Swap two random columns
3: Exit
2
Swapping columns 2 and 1
81 14 3 39 
49 35 13 69
28 67 15 76
19 33 71 26
1: Swap two random rows
2: Swap two random columns
3: Exit
2
Swapping columns 3 and 2
81 14 39 3 
49 35 69 13
28 67 76 15
19 33 26 71
1: Swap two random rows
2: Swap two random columns
3: Exit
1
Swapping rows 2 and 1
81 14 39 3
28 67 76 15
49 35 69 13
19 33 26 71
1: Swap two random rows
2: Swap two random columns
3: Exit
3
*/

import java.util.*;
public class Jaylen_Small_Lab11 {
    public static Scanner input = new Scanner(System.in);
    
    // Method for swapping rows
    public static void SwapRow(int[][] matrix){
        // Picks two random rows from the 2d array
        int firstRow = (int)(Math.random() * matrix.length);
        int secondRow = (int)(Math.random() * matrix.length);
        
        System.out.println("Swapping rows " + firstRow + " and " + secondRow);
        
        // Switches the two randomly picked arrays around
        int[] temp = matrix[firstRow];
        matrix[firstRow] = matrix[secondRow];
        matrix[secondRow] = temp;

        // For loop to print the array
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        // Recalls the user selection method
        UserSelection(matrix);
    }

    public static void SwapColumn(int[][] matrix){
        // Picks two random columns from the 2d array
        int firstCol = (int)(Math.random() * matrix[0].length);
        int secondCol = (int)(Math.random() * matrix[0].length);

        System.out.println("Swapping columns " + firstCol + " and " + secondCol);
        
        // Method that switches the two randomly picked columns around
        for (int i = 0; i < matrix.length; i++){
            int temp = matrix[i][firstCol];
            matrix[i][firstCol] = matrix[i][secondCol];
            matrix[i][secondCol] = temp;

        }

        // For loop to print the array
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        // Recalls the user selection method
        UserSelection(matrix);
    }

    public static void UserSelection(int[][] matrix){
        // Switch statement that prompts user choice
        System.out.println("1: Swap two random rows");
        System.out.println("2: Swap two random columns");
        System.out.println("3: Exit");
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                SwapRow(matrix);
                break;
            
            case 2:
                SwapColumn(matrix);
                break;
        
            case 3:
                System.exit(0);
                break;
        }
    }
    
    public static void main(String[] args) {
        // Ask user for 2d array length
        System.out.print("Input values: ");
        int row = input.nextInt();
        int column = input.nextInt();

        int[][] matrix = new int [row] [column];

        // For loop that generates a 2d array with random numbers between 0 and 100
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }

        // For loop to print the array
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        // Calls the user selection method
        UserSelection(matrix);
    }
}
