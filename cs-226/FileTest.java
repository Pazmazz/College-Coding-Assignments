import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class InvalidTestScoreException extends Exception {
    int testScore;

    InvalidTestScoreException(int testScore){
        System.out.println("Invalid test score " + testScore);
    }
}

public class FileTest {
    public static void main(String[] args) throws FileNotFoundException{
        //File file = new File("cs-226/TestScores.txt");
        //System.out.println("Does this file exist? " + file.exists());

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a file path to read out test scores: ");

        String filePath = input.nextLine();
        File file = new File(filePath);
        
        Scanner fileRead = new Scanner(file);

        while (fileRead.hasNext()){
            int testScore = fileRead.nextInt(); 
            
            if (testScore > 100) {
                new InvalidTestScoreException(testScore);
            }
        }
    }

    static void fileReading(Scanner fileRead) throws InvalidTestScoreException{
        int testScore = 0;

        while (fileRead.hasNext()){
            testScore = fileRead.nextInt(); 
            
            if (testScore > 100) {
                new InvalidTestScoreException(testScore);
            }
        }
    }
}
