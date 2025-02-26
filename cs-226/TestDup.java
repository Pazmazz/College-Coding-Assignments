/*
Written by: Jaylen Small

Output:
   Enter ten intagers: 34 5 3 5 6 4 33 2 2 4
   The distinct integers are 34 5 3 6 4 33 2 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TestDup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userList = new ArrayList <>();

        System.out.print("Enter ten intagers: ");

        //values = "34 5 3 5 6 4 33 2 2 4";
        String values = input.nextLine();

        String[] tempArr = values.split(" ");

        for (String i : tempArr){
            int j = Integer.parseInt(i);
            userList.add(j);
        }

        removeDuplicate(userList);
    }

    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> tempList = new ArrayList <>();

        for (int i = 0; i < list.size(); i++){
            if (!tempList.contains(list.get(i))){
                tempList.add(list.get(i));
            }
        } 

        String result = customtoString(tempList);

        System.out.println("The distinct integers are " + result);
    }

    public static String customtoString(ArrayList<?> list){
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i).toString());
            builder.append(" ");
        }
        
        return builder.toString();
    }
}
