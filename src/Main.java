import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {
        File myFile = new File("ballon.txt");

        try {
            if(myFile.createNewFile()) {
                System.out.println("File created successfully " + myFile.getName());
            }else  {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An Error occurred");
            e.printStackTrace();
        }
    }
}