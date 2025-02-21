/*Author: Jaylen Small 
Written: 10/11/24

Compilation: javac Jaylen_Small_Test2.java
Execution: java Jaylen_Small_Test2

Solution to the lab portion of the second test involving rolling dice 
and calculating how long it takes to roll a snake eyes with two pair of dice

Sample Output:
roll die1 die2
1    2    3
2    4    5
3    5    5
4    6    1
5    6    2
6    5    3
7    3    1
8    1    4
9    3    4
10    1    5
11    5    4
12    4    2
13    3    4
14    1    1
Snake Eyes!
*/
public class Jaylen_Small_Test2 {
    public static void main(String[] args) {
        // Generates random number between 1 and 6 for dwo dice and initializes the roll counter
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;
        int roll = 0;

        System.out.println("roll die1 die2");

        // A while loop that rolls two dice until both die roll a 1, in which the loop will break
        while (die1 != 1 || die2 != 1) {
            die1 = (int)(Math.random() * 6) + 1;
            die2 = (int)(Math.random() * 6) + 1;
            roll++;
            System.out.println(roll + "    " + die1 + "    " + die2);
            if (die1 == 1 && die2 == 1){
                System.out.println("Snake Eyes!");
                break;
            }
        }
    }
}
