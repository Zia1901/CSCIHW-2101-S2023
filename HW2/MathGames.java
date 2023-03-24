package HW2;

public class MathGames {
    
    // 1. Method to calculate the Pythagorean Theorem
    public static double pythagorean(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }
    
    // 2. Method to calculate the letter grade based on a given grade
    public static String grade(double grade) {
        int roundedGrade = (int) Math.ceil(grade);
        String letterGrade;
        
        if (roundedGrade >= 90) {
            letterGrade = "A";
        } else if (roundedGrade >= 80) {
            letterGrade = "B";
        } else if (roundedGrade >= 70) {
            letterGrade = "C";
        } else if (roundedGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        return letterGrade;
    }
    
    // 3. Method to calculate the tip per person
    public static double tip(double totalBill, int numPeople, double tipPercentage) {
        double tipAmount = totalBill * (tipPercentage / 100.0);
        double totalWithTip = totalBill + tipAmount;
        double tipPerPerson = Math.ceil(totalWithTip / numPeople);
        return tipPerPerson;
    }

    // Tester method to check the implementation
    public static void main(String[] args){
        // Pythagorean Theorem
        double a = 3;
        double b = 4;
        double c = pythagorean(a, b);
        System.out.println("The hypotenuse of the triangle with sides " + a + " and " + b + " is " + c);

        // Grade calculation
        double grade = 69.3;
        String letterGrade = grade(grade);
        System.out.println("The grade " + grade + " corresponds to the letter grade " + letterGrade);

        // Tip calculation
        double totalBill = 100.0;
        int numPeople = 4;
        double tipPercentage = 18.0;
        double tipPerPerson = tip(totalBill, numPeople, tipPercentage);
        System.out.println("If " + numPeople + " people split a bill of $" + totalBill + " with " + tipPercentage + "% tip, " 
            + "each person would pay $" + tipPerPerson + " with the tip included.");
    }
}