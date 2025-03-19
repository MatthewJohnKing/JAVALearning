package gross_calculator;
// This is the second of my learning codes, GrossPayCalculator.java comes first.
import java.util.Scanner;

public class SalaryCalculator {
    //scenario, Sales people are paid a flay £1000 rate for works, and get a bonus
    // of £250 if they reach 10 sales.
    public static void main(String[] args){
        // Initialise known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get values for the unknown (number of sales to compare to quota)
        System.out.println("Number of sales this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        //Now for the if statement
        if(sales > quota){
            //must be a boolean statemnt obviously
            //needs {} bracers
            salary += bonus;
        }

        //Output
        System.out.println("The basic employee's pay is $" + salary);

        // if else makes it a split path, and it must use one path or the other.
        // New scenario, 10 sales is a minimum expected amount, they get congratulated
        // if they reach it, or scolded if they don't

        if(sales >= quota){
            System.out.print("Congrats! You did your job!");
        }
        else{
            int shortSales = quota-sales;
            System.out.println("You did not manage to reach the quota by " + shortSales + "sales");
        }
        // note that the else is not in the if {}
        // but has its own {} and no statement
        // can use ifelseif decision structure for more choices

        // If they get another bonus £50 for each sale above 12 and £75 above 15
        if(sales > 15){
            salary=salary + (sales-12)*75;
        }
        else if(sales > 12){
            salary = salary + (sales - 12) * 50;
        }

        System.out.println("The employee's pay with all bonus' is $" + salary);

        // another decision tree is the switch and is used to check equality against a
        // number of fixed cases.

        // Say the sales people are ranked, A,B,C,D,F
        // They may give that score to get feedback

        System.out.println("Give your letter grade:");
        String grade = scanner.next();
        String message;
        switch(grade){
            case "A":
                message="Excellent Job!";
                break;
            case "B":
                message="Great Job!";
                break;
            case "C":
                message="Good Job!";
                break;
            case "D":
                message="Try harder";
                break;
            case "F":
                message="You are fired!";
                break;
            default:
                message = "Error. Invalid grade.";
                break;
        }
        // in a switch goes a variable
        // cases are followed by a : and are ended with a break, theis works the same
        // as {} for this particular setup. It contains the code for that case.
        // good practice to have a default case to catch anything else.
        // Switches allow for fall-through, eliminating the break clause on a case will
        // then have the code run the next cases code too until it reaches a break,
        // despite not being in the new case!

        System.out.println(message);
        scanner.close();

        // switch expressions are like switch statements (above)
        // allow direct assigning of values when the cases match.
        // The difference is that you would have something like;
        // String message = switch(grade){ AS BEFORE
        //      case "A" -> "Excellent job!";
        //      case "B" -> "Great job!"; ......
        //      };
        // but now you do not have the message = "output"
        // just the outputs.
        // the colon is replaced by an arrow ->
        // break also not needed.
        // a ; goes after the switch } to close the original line.

        // Relational operators return booleans, true/false
        // > greater than
        // < less than
        // >= greater or equal than
        // <= less or equal than
        // == exactly equal      = is used for assignment
        // != not equal to
        // >,< etc can not be used on booleans

        // logical operators combine booleans
        // && and (both)
        // || or (at least one)
        // ! not must be false
        // !A is not A where A is boolean
        // the others need A && B, or A || B where A and B are bools

        // END OF SESSION 2.
        
    }
}

