package Project3;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int lives = 3;
    static int panel = 8;

    public static void rules(){
        System.out.println("Welcome to SquidGame!\n");
        System.out.println("There will be 8 glass panels with: ");
        System.out.println("1. Tempered Glass\n2. Glass");
        System.out.println("\n\nStep on tempered glass and you will live and step on glass and you will die!");
        System.out.println("Choose which panel you want to step on! (L or R)\n\n\n");
    }

    public static void main(String[] args) {
        int round=1;
        ArrayList<Integer> arrayL = new ArrayList<Integer>();
        ArrayList<Integer> arrayR = new ArrayList<Integer>();

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        rules();

        System.out.println("|||||||||| ---- Start");
        while(true){
            arrayL.add(rand.nextInt(2));
            if(arrayL.get(arrayL.size() - 1) == 1) arrayR.add(0);
            else arrayR.add(1);

            System.out.println("| ? || ? |");
            System.out.println("Enter L or R: ");
            String choice = scan.next();

            if(Objects.equals(choice, "L") || Objects.equals(choice, "l")){
                if(arrayL.get(arrayL.size() - 1) == 0){
                    lives--;
                    System.out.println("You lost a life!\nRemaining lives: "+lives);
                }
            }
            else if(Objects.equals(choice, "R") || Objects.equals(choice, "r")){
                if(arrayR.get(arrayL.size() - 1) == 0){
                    lives--;
                    System.out.println("You lost a life!\nRemaining lives: "+lives);
                }
            }

            System.out.println("|||||||||| ---- Start");
            for(int i=0; i<arrayR.size(); i++){
                System.out.println("| "+ arrayL.get(i) +" || "+ arrayR.get(i) +" |");
            }

            if(lives == 0){
                System.out.println("\nNo lives remaining!\nYou lose!");
                break;
            }

            if(round == panel){
                System.out.println("|||||||||| ---- Finish");
                System.out.println("You win!");
                break;
            }
            round++;
        }
    }
}
