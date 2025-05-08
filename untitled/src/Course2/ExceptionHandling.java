package Course2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    /*
    Exceptions, obviously are error events that stop the normal flow of the program.

    String[] place = {"work","school","cinema"};

    for(int i=0; i<4; i++){
        System.out.println("I am going to " + places[i]);
    }

    compiles but index 3 doesn't exist! so the program crashes
    can format to handle better


    Going to use the file class as an example

    try catch block
     */

    public static void main(String[] args){

        File inputFile = new File("numbers.txt");
        File outputFile = new File("output.txt");

        try(
                //outputFile.createNewFile();
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile);
        ){
            // file.createNewFile();
            //fileReader = new Scanner(file); not needed due to try declaratiom
            while(fileReader.hasNext()){
                fileWriter.println(fileReader.nextDouble());
                // the next double method throws an unchecked exception
            }

        }catch(FileNotFoundException | InputMismatchException e) { //multicatch
            e.printStackTrace();
        } finally{
           // fileReader.close();// not needed due to try declaration
        }


        //You could even create the needed directory
        // Exceptions are objects and so have methods, including a get method
        //which will detail why the exception occured. We can append that message.

        /*
        Exceptions also have stack traces, which track which methods were called that
        Lead to the exception. It allows to trace the path.
        Helps find what went wrong. this is the .printStackTrace()
        Native methods were not written in JAVA and cannot be inspected from the stack trace

        There are two catagories of exceptions, checked and unchecked.
        InputMismatchExceptions are Unchecked
        IOExceptions are Checked
        Checked Exceptions are verified by the compiler before the code is executed.
        Unchecked are not. If the method throws a checked exception it must be declared
        in the methods signiture. This tells the compiler to look for the possibility of
        having an exception thrown.
        Runtime exceptions and similar are unchecked, they do not need to be declared
        by methods. Checked Exceptions are typically used when there is a chance for recovery.
        Unchecked are used when thre is not really.

        Some code can throw multiple Exceptions. Polymorthism, series of catches, Multiple catch block.
        SuperClasses can catch broader exceptions.
        Exception is an exception/the exception class.

        in a finally block any code that needs executing in case of either success
        or failure can be given

        try with resources allows declaration that should automatically be closed instead of having to declare
        closeures in a finally block
         */

    }

    public static double calculatePay(double hours, double payRate) throws NegativeInputException{
        if(hours>40){
            throw new IllegalArgumentException("Hours must be less than or equal to 40");
            //this is an unchecked exception
        }
        if(hours<0 || payRate<0){
            throw new NegativeInputException();
            // this is a checked exception that we wrote
        }
        return hours*payRate;
        /*
        There are scenarios where an exception may be wanted.
        adding a condition for if hours>40

        If code has a checked exception it must either be caught or rethrown
        when an exception is rethrown it is just tdealt withhigher up the tree.
        this is done by adding throws ExceptionName to the name.
         */
    }


}
