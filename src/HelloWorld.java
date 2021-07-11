import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class HelloWorld {
    public static void main (String [] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\preks\\IdeaProjects\\Misc\\src\\file");
        char [] arr = new char [50];
        fileReader.read(arr);
        System.out.println(arr);
    }
}
