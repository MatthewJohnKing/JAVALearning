package gross_calculator;
// This is the third of my learning codes,
// GrossPayCalculator.java comes first.
// Salary Calculator.java comes second.

import java.util.Scanner;

public class HourlyPayCalculator {
    // This will focus on while loops.
    // Each store employee makes $15 per hour no overtime, number of hours are entered.
    public static void main(String[] args){

        // Known Variables
        int payRate = 15;
        int maxHours = 40;

        // Get input for unknowns, total hours
        System.out.println("How many hours did the employee work?");
        Scanner scanner= new Scanner(System.in);
        double hoursWorked =  scanner.nextDouble();

        //Validate input
        while(hoursWorked>maxHours){
            System.out.println("Invalid Entry, hours must be less than 40");
            System.out.println("How many hours did the employee work?");
            hoursWorked =  scanner.nextDouble();
        }

        //Gross pay
        double gross= payRate * hoursWorked;
        System.out.println("Gross pay : $" + gross);

        // While loops need caution as an infinite loop can be created
        // Condition is tested before entered
        // one part of condition must be updated for a result

        // DoWhile loops check the condition AFTER the loop, not before.

        // Enter daily hours until the max hours are reached.

        System.out.println("Alternative input approach, enter daily hours");

        double totalHoursWorked=0;
        int dayCount=0;
        do{
            System.out.println("How many hours did the employee work today?");
            hoursWorked =  scanner.nextDouble();
            totalHoursWorked+=hoursWorked;
            dayCount+=1;
            if(totalHoursWorked>40){
                totalHoursWorked=40;
                System.out.println("Maximum work week hours reached.");
            }
        }while(totalHoursWorked<40 && dayCount<7);
        // do while doesn't have a condition at the start but at the end.

        gross= payRate * totalHoursWorked;
        System.out.println("Gross pay : $" + gross);

        // another loop of the for loop which has an incrementor as it's condition
        // for example if you want to enforce it does all 7 days, or you know how
        // days were worked in advance.

        System.out.println("Alternative input approach, enter how many days worked and daily hours");

        totalHoursWorked=0;

        System.out.println("How many days did the employee work?");
        dayCount=scanner.nextInt();
        for(int i=0; i<dayCount; i++){
            System.out.println("How many hours did the employee work on day" + i+1);
            hoursWorked =  scanner.nextDouble();
            totalHoursWorked+=hoursWorked;
            if(totalHoursWorked>40){
                totalHoursWorked=40;
                System.out.println("Maximum work week hours reached.");
                break;
            }
        }


        // for loops have 3 statements, the variable and initialisation, the condition, and the update
        // warning, updating i, even in the println, will change the result.
        scanner.close();

        gross= payRate * totalHoursWorked;
        System.out.println("Gross pay : $" + gross);

        /*
        note that loops can be nested, by just defining another loop in the original
        make sure to use a new counting variable.

        break statements can also be given in the loops. but will want to be within a
        test so it is not hit every time.

        END OF SESSION 3.
        */

        // Session 4.
        // Methods are the equivalent of functions
        // Methods are structured as
        // Header
        // AccessModifier NonAccessModifier OutputType MethodName(INPUTARGS)
        // Accessmodifier is how can use the method
        // NonAccessModifier (not always needed)
        // Output type must be decalred, even if void, only 1 output  (always needed)
        // MethodName conventionally starts with a verb
        //  MethodName(INPUTARGS) is the methods signiture and must be unique within the class
        // method must include a return statement

        /*
        public static int calculateSum(int number1, int number2){
        int sum = number1 + number2;
        return sum;
        }
        */

        // Public, any code from any class
        // static
        // final
        // abstract
        // synchronized

        // methods must be called.

    }

}
