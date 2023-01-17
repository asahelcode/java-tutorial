import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args)  {
        try {
            FileWriter myFile = new FileWriter("src/testFile.txt");
            myFile.write("Programming in java is quite interesting");
            myFile.close();
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            System.out.println("An Error occurred");
            e.printStackTrace();
        }
    }
}