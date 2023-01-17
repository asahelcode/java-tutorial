import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner userInput = new Scanner(System.in);
        System.out.println("Enter current weather: ");

        String currentWeather = userInput.nextLine();

        switch(currentWeather) {
            case "Stormy":
                System.out.println("Quickly seek a shelter");
                break;
            case "Cold":
                System.out.println("Get a sweater with a cardigan now!");
                break;
            case "heat":
                System.out.println("Put off all your clothings");
                break;
            default:
                System.out.println("User not current from planet Earth!");
                break;
        }
    }
}