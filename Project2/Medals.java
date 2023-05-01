package Project2;

import java.util.ArrayList;

public class Medals {
  public static void main(String[] args) {
        final int COUNTRIES = 7;
        final int MEDALS = 3;

        String[] countries = {
            "Canada",
            "China",
            "Germany",
            "Korea",
            "Japan",
            "Russia",
            "United States"
        };

        int[][] counts = 
        { 
            { 1, 0, 1 },
            { 1, 1, 0 }, 
            { 0, 0, 1 }, 
            { 1, 0, 1 }, 
            { 0, 1, 1 }, 
            { 0, 1, 1 },
            { 1, 1, 0 }
        };

        System.out.println("        Country    Gold    Silver    Bronze   Total");
        for (int i = 0; i < COUNTRIES; i++) {
            int total = 0;
            System.out.printf("%15s", countries[i]);
            for (int j = 0; j < MEDALS; j++) {
                System.out.printf("%8d", counts[i][j]);
                total += counts[i][j];
            }
            System.out.printf("%8d\n", total);
        }

        ArrayList<Integer> medalCounts = new ArrayList<>();
        for (int j = 0; j < MEDALS; j++) {
            int sum = 0;
            for (int i = 0; i < COUNTRIES; i++) {
                sum += counts[i][j];
            }
            medalCounts.add(sum);
        }
        
        System.out.println();
        System.out.printf("%8s%8s%8s\n", "Gold", "Silver", "Bronze");
        for (int j = 0; j < MEDALS; j++) {
            System.out.printf("%8d", medalCounts.get(j));
        }
        System.out.println();
    }
}