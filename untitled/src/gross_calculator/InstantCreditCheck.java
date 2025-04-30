package gross_calculator;
// This is the fifth of my learning codes,
// GrossPayCalculator.java comes first.
// Salary Calculator.java comes second.
// HourlyPayCalculator.java comes third.
// Greeting.java comes forth.

import java.util.Scanner;

public class InstantCreditCheck {

    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your salary");
    double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        boolean qualified = isUserQualified(actualSalary, actualCreditScore);

        notifyUser(qualified);
    }

    public static boolean isUserQualified(double salary, int creditScore){
        double reqSalary=25000;
        int reqCreditScore=700;

        if(creditScore>= reqCreditScore && salary>=reqSalary){
            //System.out.println("You have been approved.");
            return true;
        }
        else{
            //System.out.println("You have not been approved.");
            return false;
        }
    }

    public static void notifyUser(boolean approved){
        if(approved){
            System.out.println("You HAVE been approved. YAY.");
        }
        else{
            System.out.println("You HAVE NOT been approved!!");
        }
    }

    // methods can be overloaded by having methods with the same name
    // but different input types
    // the different parameter lists distinguish the methods.
    // cleans up variable use cases.
}
