package HW4;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

     public static void Arraysums(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int total = 0;
        int num = 0;
        System.out.println("I will ask you to enter 10 numbers and then I will display the total and the array. ");
        for(int i = 0; i < 10; i++){
            System.out.println("Number: ");
            num = input.nextInt();
            nums.add(num);
            total += num;
            System.out.println("The total so far is " + total + ".");
        }
        
        System.out.println("Total: " + total);
        System.out.print("Array: {");
        for(int i = 0; i < nums.size(); i++){
            System.out.print(nums.get(i));
            if(i < nums.size() - 1){
                System.out.print(",");
            }
        }
        System.out.print("}");
         System.out.println("");
         
    }
public static String bruteForce(String password){
    String answer = "";

    char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
    '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};

    // Convert the password to a character array
    char[] passwordArray = password.toCharArray();

    // Iterate through each index of the password array
    for (int i = 0; i < passwordArray.length; i++) {
        // Create a new string with the characters up to the current index
        String currentAttempt = new String(passwordArray, 0, i + 1);

        // Print the current attempt
        System.out.println(currentAttempt);

        // Check if the current attempt matches the password
        if (currentAttempt.equals(password)) {
            answer = currentAttempt;
            break;
        }
    }

    return answer; 
}

public static int[] sorter(int[] nums){
    int[] sortedArray = new int[nums.length];
    for(int i = 0; i < nums.length; i++){
        sortedArray[i] = nums[i];
    }
    int temp = 0;
    for(int i = 0; i < sortedArray.length-1; i++){
        for(int j = i+1; j < sortedArray.length; j++){
            if(sortedArray[i] > sortedArray[j]){
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[j];
                sortedArray[j] = temp;
            }
        }
    }
    return sortedArray;
}
 public static void main(String[] args) {
     
        System.out.println("Hello World!");
        Arraysums();
        bruteForce("Zzzz");
        int[] myArray = {9,10,2,5,3,4,7,8};
        int[]nums;
         nums = sorter(myArray);
         System.out.print("Array: {");
        for(int i = 0; i < 8; i++){
            System.out.print(nums[i]);
                System.out.print(",");
        }
        System.out.print("}");
       

    }
    
}