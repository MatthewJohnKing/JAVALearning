package Course3;

import java.awt.*;

public class Oob {

/*
Four Pillars of OoP languages are abstraction, inheritance, encapsulation and polymorphism.
There is a claim anything in life can be represented in code.

A class contains Attributes and behaviours. they are kinda blueprints.

See tree class for a bloueprint and Enum class description TreeType.

 */

    public static void main(String[] args){
        Tree OakTree = new Tree(TreeType.OAK,12,120);
        Tree MapleTree = new Tree(TreeType.MAPLE,30,90);

        OakTree.grow();
        System.out.println(OakTree.getTreeType());

        /*
        if (OakTree.heightFt>100){
            System.out.println("That is a tall OAK Tree");
        }

        if (MapleTree.heightFt>100){
            System.out.println("That is a tall MAPLE Tree");
        }
         */

        OakTree.isTall();
        MapleTree.isTall();

        /*
        Non Static Members are part of an obkject that is accessible with an instance and belongs to it. In the tree
        example each of the fields  and the methods are non-static. They are instance member.

        A static member is accessible by the class not an instance. We can create a fixed trunk colour that is static.
        We can create a static method. Static Methods and Feilds can not depend on the instance, non-static variable.
         */
        Tree.announceTree();
        System.out.println(Tree.TRUNK_COLOR);

        /*
        Color is an inbuilt Java Class.
        Exploring the Color Class has a few static attributes, fixed colors.
         */
        Color myWhite=Color.white;
        /*
        The non static methods are deeply described in the comments.
        You can find the constructors, and tests to make sure the input is
        valid. Brighter and Draker Methods
        Instance methods are useful
         */
        Color myBlue=Color.BLUE;
        Color brighterBlue=myBlue.brighter();
        brighterBlue.getBlue();

        Employee person1 = new Employee("Ann", "Home", 70000.0,32);
        Employee person2 = new Employee("Barry", "Office", 70000.0,32);
        person2.raiseSalary();

        System.out.println(person1.salary);
        System.out.println(person2.salary);

        /*
        Encapsulation is one of the Pillars. It is about binding state and behavior
        into a single unit. This is what a class does.
        We can easily modify the inner workings of one class without affecting the rest of the program.
        (Only works when there is a clear interface between the class and the rest of the program.)
        Not everything can have direct access.
        We can make class attributes hidden so that the other classes can't directly interfeir.
        This then becomes the point of setter and getter methods (I assume)
        Provides a clear interface.
        Programs become less error prone.
        less code changes to change.

        using access modifiers matter.
        Private protected and public and NONE

        Private are only visible in the class the member lives in
        None it is voisioble in the package
        Protected are in the package and subclasses]
        Public is everywhere

        Resricting each attribute with private modifier, need public methods to get to them
        These are retrieved by the getter methods.
        Varying is done by the Setter

         */
    }


}