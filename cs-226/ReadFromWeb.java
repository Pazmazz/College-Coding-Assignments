import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

public class ReadFromWeb {
    public static void main(String[] args) throws MalformedURLException{
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a valid URL: ");
        String urlString = input.nextLine();

        switch (urlString) {
            case "0":
                urlString = "https://www.d.umn.edu/~rmaclin/gettysburg-address.html";
                break;
        
            case "1":
                urlString = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
                break;
        }
        
        System.out.println(urlString);
        //File file = new File(urlString);

        try {
            URI uri = new URI(urlString);
            URL url = uri.toURL();
            int count = 0;

            Scanner urlInput = new Scanner(url.openStream());
            while(urlInput.hasNext()){
                String line = urlInput.nextLine();
                
                count += line.length();
            }

            System.out.println("The URL has " + count + " words");
        } 
        catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("IOException reached");
        }
        catch (URISyntaxException ex){
            System.out.println("Exception has been reached");
        }
    }
}
