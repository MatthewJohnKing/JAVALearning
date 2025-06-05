package learning_files;
// This is the forth of my learning codes,
// GrossPayCalculator.java comes first.
// Salary Calculator.java comes second.
// HourlyPayCalculator.java comes third.

import java.util.Scanner;

public class Greeting {

    public static void main(String args[]){
        greetUser();
    }
    // Methods can be declared anywhere in any order, but only run when called in the main.

    public static void greetUser(){
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name= scanner.next();
        System.out.println("Hi there, " + name);
        scanner.close();
    }

    // Variables in methods only exist within the method.
    // They can not be referenced outside except as the output.
    // THe variable scope is contained within the {} it is defined in.
    // Therefore, this includes variable defined in if statements as an example
    // local variable s are defined in a method
    // global variables are defined at the class level.
    // Variables can share names within different scopes, and will be stored differently
    // Smaller Scope variables are referenced first.
    // global versions can be called in a method by using this.variable



}
