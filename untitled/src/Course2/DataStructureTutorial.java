package Course2;

import java.util.HashSet;
import java.util.Set;

import java.util.List;
import java.util.ArrayList;

import java.util.Queue;
import java.util.LinkedList;

public class DataStructureTutorial {
    /*
    Collections are a type of data structure and the objects
    contained within are known as elements

    some collections require uniqueness of elements others allow
    for duplication.
    some have order and others don't

    the collections framework is required from the
    java.util.* package
    JAVA does not provide any implementations for the interface collections
    but there are also other interfaces that inherit from collection
    such as sets lists queues and maps

    Set is an unordered unique element collection (deck of cards)
    Lists are ordered elements and can have diuplicates (cal history)
    Queue is a collection of ordered elements (like list) that will be
        processed in order, new elements are added at the end
    Map does not inherit from the dataCollection interface, but contains
        similar operators. It exists as a collection of unordere unique
        key-value pairs (list of bank transactions, location and amount)

    data structures use algorithms. the collections CLASS contains common
    algorithms used on the data structures. Such as
    binarySearch, reverse, copy, shuffle, frequency, sort

    the datastructures are interfaces. they can not instantiated.

     */
    public static  void main(String[] args) {
        /*
         since Sets are unordered unique lists adding the same element
    more than once, does not add it, and no control over the order of elements.

    add is good at adding, of can also be used, but the result is immutable
         */
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("Have Lemon? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println( fruits.size());

        Set moreFruit = Set.of("pear","raisin","cherry");
        System.out.println(moreFruit);
        // moreFruit.add("cranberry"); won't work
        // moreFruit.remove("pear"); won't work

        /*
        Lists are a very common datastructure
        Array Lists, Link lists, stack, vector are examples
        Lists are ordered and so the elements keep order.
        We can also access the elements by their location.
        Duplicates can also be added.
        .indexOf returns the index of the first instance
        .lastindexOf returns the last instance

        .remove removes the first instance of it
        .remove(index) removes the element at the index

        Immutable list is once again list.of(arg1,arg2,arg3,...)
         */

        List fruits2 = new ArrayList();
        fruits2.add("apple");
        fruits2.add("banana");
        fruits2.add("lemon");
        fruits2.add("orange");

        System.out.println(fruits2);
        System.out.println(fruits2.get(2));
        fruits2.set(2,"grape");
        fruits2.add("lemon");
        System.out.println(fruits2);
        fruits2.indexOf("lemon");
        System.out.println("Have Lemon? " + fruits2.contains("lemon"));

        fruits2.remove("lemon");
        fruits2.remove(3);
        System.out.println( fruits2.size());

        /*

        Queues is a collection for processing
        Linkedlists and priorityQueues

        queue contains additional methods for addition, removal, and inspection
        of it elements.
        ordering in maintained.
        duplicates are allowed.
        queues follow first in, first out
        queue.remove() removes the first object, and returns the element
        the first element is known as the head
        the last is known as the tail

        the peek method returns the head of the queue

         */
        Queue fruits3 = new LinkedList();
        fruits3.add("apple");
        fruits3.add("banana");
        fruits3.add("lemon");
        fruits3.add("orange");
        fruits3.add("lemon");
        System.out.println(fruits3);

        var removed = fruits3.remove();
        System.out.println(removed);
        fruits3.peek();

    }
}
