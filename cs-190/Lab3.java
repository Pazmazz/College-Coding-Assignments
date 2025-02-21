/*Author: Jaylen Small 
Written: 9/6/24

Compilation: javac Lab3.java
Execution: java Lab3

Solution to the Lab2.18, this program prints a table that cast floating-point numbers into integers

Sample Output:
a     b  pow(a, b)
1     2        1
2     3        8
3     4       81
4     5     1024
5     6    15625
*/
public class Lab3 {
    public static void main(String[] args) {
        // Printing the table using printf to space it appropriately
        System.out.printf("%4s%6s%11s","a","b","pow(a, b)");
        System.out.println("");
        System.out.printf("%4s%6s%9s","1","2", (int)Math.pow(1, 2));
        System.out.println("");
        System.out.printf("%4s%6s%9s","2","3", (int)Math.pow(2, 3));
        System.out.println("");
        System.out.printf("%4s%6s%9s","3","4", (int)Math.pow(3, 4));
        System.out.println("");
        System.out.printf("%4s%6s%9s","4","5", (int)Math.pow(4, 5));
        System.out.println("");
        System.out.printf("%4s%6s%9s","5","6", (int)Math.pow(5, 6));
        System.out.println("");
    }
}
