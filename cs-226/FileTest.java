import java.util.Scanner;
import java.io.File;

class InvalidTestScoreException extends Exception {
    int testScore;

    InvalidTestScoreException(int testScore){
        
    }
}

public class FileTest {
    public static void main(String[] args) {
        File file = new File("cs-226/TestScores.txt");

        //System.out.println("Does this file exist? " + file.exists());
    }
}
