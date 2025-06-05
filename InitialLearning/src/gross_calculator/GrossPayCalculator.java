package gross_calculator;

import java.util.Scanner;

// Reserved Words (package, public class etc)
// packages (convension lower case) act as folders of grouped code
public class GrossPayCalculator {
    // must pay attention to the {} bracers, as all code for the methods of the class and then the functions etc must be
        // contained within the {} bracers.
    public static void main(String[] args){
        // main is the first function run on a call of the code
        // this functions name is main
        // System.out.println("Hello World");
        // System.out.println(" TEXT "); will print the text given by TEXT
        // Every line/statement must be concluded with a semicolon
        // Obviously // act as a commented line.

        // Line 10 will now be commented out to continue the course

        //1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        // variable names are just given
        // errored code is given in red
        // Variables must be declared in JAVA (Statically typed)
        // want hours to be an integer, so we declared it with int

        //2. Get the hourly pay rate
        // will want a decimal, we will use double
        double payRate = 0;
        System.out.println("What is your pay rate?");
        payRate=scanner.nextDouble();

        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        //4. display
        System.out.println("Gross pay: " + grossPay);

        // data types are;
            // byte      8-bit  Integer
            // short    16-bit  Integer
            // int      32-bit  Integer
            // long     64-bit  Integer
            // float    32-bit  Floating Point
            // double   64-bit  Floating point
            // boolean   1-bit  Boolean
            // char     16-bit  Character placed in single 'C' quoation marks, strings use "CC"

        // local variables that are contained within a method, and can be declared with var and use type inference.

        // convensions: variables startWithLowerCaseAndUseCamalCase
        // Obviously you can't use spaces.
        // numbers can not be the first character#
        // only some special characters can be used
        // reserved words can't be used

        //ENDING SESSION 1 HERE

        //STARTING SESSION 2 HERE
        // Want to change hardcoded variables to input variable
        //changing hours = 0 and then request an input
        // The scanner class is not currently included so it needs to be imported.
        // This is revealed by the colour over the words.
        //This has been put at the top.
        // Typing scanner. reveals options, pick correct data types.
        //scanner can be closed too to save computational.
        scanner.close();
    }

    // Arithmatic operators are fixed usage, only + can be used on characters and strings
    // + adds
    // - subtracts
    // * multiplies
    // / divides
    // % is the modulo, a%b returns mod_b(a) remainder(a/b)

    // if statements are decision trees
    // move to Salary Calculator
}
