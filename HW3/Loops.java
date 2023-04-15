package HW3;
import java.util.Scanner;

public class Loops {

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    public static boolean loopE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public static String stringZ(String str) {
        if (str.length() <= 2) return str;
        String result = "" + str.charAt(0);
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'z') {
                result += str.charAt(i);
            }
        }
        result += str.charAt(str.length() - 1);
        return result;
    }

    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    public static void sums() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me....");
        int total = 0;
        while (true) {
            System.out.print("Number: ");
            int num = scanner.nextInt();
            total += num;
            System.out.println("The total so far is " + total + ".");
            if (num == 0) {
                break;
            }
        }
        System.out.println("TOTAL ENDED --- The total is " + total + ".");
    }

    public static void main(String[] args) {
        // Test cases for the methods
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));

        System.out.println(loopE("eat"));
        System.out.println(loopE("eeat"));
        System.out.println(loopE("eeeat"));
        System.out.println(loopE("eeeeat"));

        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));

        System.out.println(stringTimes("Code", 2));
        System.out.println(stringTimes("Code", 4));

        System.out.println(stringZ("zHelloz"));
        System.out.println(stringZ("nozthaznks"));
        System.out.println(stringZ("xksiazdjaasldzsajzasdz"));

        System.out.println(makes10(9, 10));
        System.out.println(makes10(9, 9));
        System.out.println(makes10(1, 9));

        sums();
    }
}

