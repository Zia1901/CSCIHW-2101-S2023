package HW5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {

        // Question 1
        // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type int.
        ArrayList<Integer> nums = new ArrayList<>(15);
        for(int i = 0; i < 15; i++){
            nums.add(0);
        }
        
        // b) Output the value of the tenth element of the array nums.
        System.out.println(nums.get(9));
        
        // c) Set the value of the 5th element of the array nums to 99.
        nums.set(4, 99);
        
        // d) set the value of the 13th element to 15
        nums.set(12, 15);
        
        // e) set the value of the 2nd element to 6
        nums.set(1, 6);
        
        // f) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
        nums.set(8, nums.get(12) + nums.get(1));


        // Question 2
        // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
        ArrayList<String> daysOfWeek = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        
        // b) output each of the days of the week
        System.out.println(daysOfWeek);
        
        // c) output the days of the week that we have class
        System.out.println("Days of the week with class: " + daysOfWeek.subList(0, 5));
        
        // d) change the arrayList to start on Sunday
        String sunday = daysOfWeek.remove(6);
        daysOfWeek.add(0, sunday);
        System.out.println(daysOfWeek);


        // Question 3 
        // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("Enter a number (0 to stop): ");
            input = scanner.nextInt();
            if (input != 0) {
                numbers.add(input);
            }
        } while (input != 0);

        // b) return the largest and smallest number
        int smallest = Collections.min(numbers);
        int largest = Collections.max(numbers);
        System.out.println("Smallest: " + smallest + ", Largest: " + largest);

        // c) return the ArrayList sorted smallest to largest
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        // d) take that ArrayList see if its size is divisible by 3 and then output the ArrayList in a matrix format
        while (numbers.size() % 3 != 0) {
            System.out.print("ArrayList size must be divisible by 3. Enter another number: ");
            input = scanner.nextInt();
            numbers.add(input);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}
