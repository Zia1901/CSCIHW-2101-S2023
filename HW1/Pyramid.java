package HW1;
public class Pyramid {
    public static void main(String[] args) {
        int rows = 5;
        int middleRow = (rows / 2) + 1;

        // Print the upper half of the pyramid
        for (int i = 1; i <= middleRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        // Print the lower half of the pyramid
        for (int i = middleRow - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
