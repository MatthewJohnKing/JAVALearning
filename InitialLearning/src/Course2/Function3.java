package Course2;

public class Function3 {
    public static void main(String[] args){

        /*

        An interface is similar to an abstract class.
        it is a stateless constructor of abstract behaviours.
        These are to be implemented by other classes
        Stateless is that they are meant to be purely abstract
        Don't even have constructors
        Fields are final
        It is implemented by other classes, not extended.

        All interfaces need a name.
        Be aware that all fields must be accessible, so private will result in an error.
        THe variable must be constant:
        Static and Final. Convension writes them in CAPS

         Any implementing class must use the declaration word Implements
         It must be an abstract Class OR define all the methods in the Interface.

         A class can implement multiple interfaces! This achieves multiple inheritance.
         caution should be taken if multiple methods in different
         interfaces have the same signiture as they will fail if they
         have different types.

        interfaces can also contain default and static methods.
        default methods must still be overwritten if anything else is required.
        static methods priovide an implementation, they are not inherited by the class
        they must be called from the Interface itself.
        Since the interface can not be instntiated they must call the interfaces name.


         */

        Product book1= new Book();
        book1.setName("In the Kitchen with H+ Sport");

    }
}
