package gross_calculator;
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
        int hours = 40;
        // variable names are just given
        // errored code is given in red
        // Variables must be declared in JAVA (Statically typed)
        // want hours to be an integer, so we declared it with int

        //2. Get the hourly pay rate
        // will want a decimal, we will use double
        double payRate = 25.50;

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
    }
}
