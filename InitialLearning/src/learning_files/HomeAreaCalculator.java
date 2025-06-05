package learning_files;

import java.util.Scanner;

public class HomeAreaCalculator {

    public static void main(String[] args){
     // the data type for an object is the class
     // new creates a new instance of the object
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 =  new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();

        Rectangle kitchen =  new Rectangle(200,400);
        Rectangle bathroom =  new Rectangle(300,700);

        double totalAreaRooms= calculateTotalArea(kitchen,bathroom);
        System.out.println("The total Area is :" + totalAreaRooms);

        Rectangle bedroom = getRoom();
    }

    // methods can accept objects as inputs

    public static double calculateTotalArea(Rectangle r1, Rectangle r2){
        return r1.calculateArea()+ r2.calculateArea();
    }

    // if you want a method to return more than one value,
    // you can do so by creating an object of those fields.

    public static Rectangle getRoom(){
        System.out.println("provide room length");
        Scanner scanner= new Scanner(System.in);
        double length = scanner.nextDouble();
        System.out.println("provide room width");
        double width = scanner.nextDouble();
        scanner.close();

        return new Rectangle(length,width);
    }

    // all primative data types can be expressed as objects via wrapper classes
    // int is a primative data type
    // Integer is a wrapper class for int
    // some conveiniance methods are only avaliable in the wrapper class
    // valueOf(int i) converts an int to an Integer

    // Records is a simple object that only has fields and mthods to access.
    // See Account, and all the get methods are automatically given.
    // fields of a record are immutable upon initialisation
    /*
    Account account = new Account(13344,12212, "Checking", 4033.93);
     */
    // the get methods do not have the get, just the variable name.
    // These types are sometimes called POJOs

    // END OF SESSION 4

    // Start of session 5
    /*
    Arrays are container variables containing multiple values
    Arrays are declared as the datatype of the variable with []
    String[] players= new String[6];
    produces an array of 6 strings called players
    once the length is declared it is fixed.
    the length is 6, the indexes are 0,1,2,3,4,5
    you call the elements of the array by
    players[0] etc
    when initialising the array you use { A , B , C , D }
    where ABCD are variables of the correct data type to generate an array of that length

    Arrays may be processed by for loops
    Arrays are vectors in a way, not matricies.

    In the main functions we have been using arrays as the inputs but not specifying
    the length. so a single variable input could be given, just as an array of 1 length.

    If you wanted to have a function that works on a list of one data type not nessersarily
    in an array, but with 0-... length you can use, this also works for an array of that data type
    public static void calculateSum(int ...a) {   }
    but how is this implemented?
    the parameter a is treated as an array, so you can loop over the length of a.
    only one input can be a vararg parameter, and it must be the last parameter in the method.

    By the way, strings are a sequence of character, they are objects, the string class is kinda
    a wrapper class, the string is also effectively an array of character, which IS
    a primative data type.
    The string class has a function that can split a string into an array of strings
    text.split("A") where A can be any character including whitespace.
    There are lots of nice methods for strings, but I can be bothered to run through this.
    long strings can be defined through text blocks, open and closed by
    """
    STUFF
    """;
    Good for SQL queries.


     */
}
