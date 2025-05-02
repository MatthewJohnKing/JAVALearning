package Course2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class FunctionalProgrammingTutorial {
    /*
    Functional Programming applies pure function to an inoput set to produce an output set

    java.util.function package is a functional interface (not object orianted)

    A functional interface is an interface with one abstract method that can be implemented
    by lambda expressions and method references

    a labda expression IS an implementation of the Consumer functional interface

    the Consumer Interface contains one abstract method taking a single input and
    it returns no result.
    the labda expressionuses the single abstract method.

    the lambda expression is only one option, you can also use a method reference
     */
    public static void main(String[] args) {
        List countries =  List.of("Australia","China","France","Italy");
        countries.forEach(c -> System.out.println(c));

        Consumer print = c-> System.out.println(c);
        countries.forEach(print);

        // accept as a now given implementation will now print the string

        print.accept("hello world");

        /*
        Consumer, Supplier, Predicate, Function, UnaryOperator are other core interfaces
        1 in no out
        no in , yes out
        1 in, bool out
        1 in, result
        1 in, result of matching type


        the functionalInterface can also provide default and static methods alongside
            the one abstract method, such as andThen which applys another operation on
            result of the previous.

        It is possible to create your own interfaces, suggested these are well annotated.
        use the
        @FunctionInterface annotation so Java enforces the rules o only one abstract method.
         */

        // square.andThen(add).apply(5);

        /*
        In addition to all of this is the java.util.stream package for functional programming
        A stream represents a series of operators that enact on a data source. I.e. from a collection, array
        or even others.
        streams do not store elements,
        no modification to source.

        can alos be done in parallel
        outputs will not be in order anymore
         */
        int[] numbers = {0,2,4,6,8,10,12};
        Arrays.stream(numbers).forEach(n-> System.out.print(n + 1 + ""));
        Arrays.stream(numbers).parallel().forEach(n-> System.out.print(n + 1 + ""));


    }

}
