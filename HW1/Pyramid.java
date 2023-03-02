package HW1;
public class SidewaysPyramid {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            int cols = i <= (rows / 2) + 1 ? 2 * i - 1 : 2 * (rows - i) + 1;
            int spaces = (2 * rows - cols) / 2;
            
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= cols; k++) {
                System.out.print("*");
            }
            
    }
}
