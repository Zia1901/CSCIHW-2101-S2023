package HW1;
import java.util.Scanner;

public class Adlibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();
        
        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();
        
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter another noun: ");
        String noun2 = scanner.nextLine();
        
        System.out.println("One day, a " + noun1 + " was walking down the street, feeling very " + adjective1 + ". Suddenly, " + number1 + " " + noun2 + " appeared out of nowhere and started chasing the " + noun1 + "!");
    }
}

