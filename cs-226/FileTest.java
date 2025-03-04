import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class InvalidTestScoreException extends Exception {
    InvalidTestScoreException(double testScore){
        System.out.println("Invalid test score " + testScore);
    }
}

public class FileTest {
    public static void main(String[] args) throws FileNotFoundException{
        //The file path is: cs-226/TestScores.txt

        double sum = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the correct file path to read out test scores: ");

        String filePath = input.nextLine();
        File file = new File(filePath);
        
        Scanner fileRead = new Scanner(file);

        while (fileRead.hasNext()){
            double testScore = fileRead.nextDouble(); 
            
            if (testScore < 0 || testScore > 100) {
                new InvalidTestScoreException(testScore);
            } else {
                count++;
                System.out.println("Test score " + count + ": " + testScore);
                sum += testScore;
            }
        }

        double average = sum/count;

        System.out.println("The sum of the test scores is: " + sum);
        System.out.println("The average of the test scores is: " + average);
    }
}
