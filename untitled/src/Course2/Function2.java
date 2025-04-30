package Course2;

import org.w3c.dom.css.Rect;

public class Function2 {
    /*
    The next key concept is polymorphisms,
    this is when two subclasses can share some of the same behaviours
    while also defining their own behaviours.

    An example of this is when an object has a type of the superclass
    BUT it is defined as an instance of the subclass.
    In the below example Sasha can be polymorphed between cat and dog as we please
    BECAUSE they are both still Animals, which is the correct type.
    BUT the methods scratch and fetch declared in the subclasses do not work.
    THis is because they only exist for the type Dog and Cat respectively.
    While makeSound is overridden.

    Typecasting can be used to move a type up or down an inheritance tree.
    This is to resolve the above issue.
    To down cast the command is set-up as
    ((Cat)sasha)
    ((SubClass)variableName)

    caution must be taken when casting variables as they must be in the
    correct branch of the tree

    the instanceof operator can be used to check instance type

    because of polymorphism, the feed method below can take Dog, Cat or just animal
    instances.
    the instance of helps keep things safe.

    Abstract is a non-access modifier used on classes and methods
    It used as a template but is not usable as is.
    Designed to be extended
    Shape is an abstract, may have side numbers, area, perimeter, but it doesn't
    know what the behaviour might be.
    Only the signiture of an abstract method is defined, not designed to be run and overritten.
    Any class containing abstract methods must also be abstract.
    Abstract classes can contain non-abstract methods.

    Until overritten the subclass inherits all methods as abstract still and so, to not be
    abstract itself it must overwrite all of them,
     */
    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Cat();
        sasha.makeSound();

        sasha = new Dog();
        sasha.makeSound();
        // sasha.fetch();

        sasha = new Cat();
        // sasha.scratch();

        ((Cat)sasha).scratch();

        sasha = new Dog();
        Dog sashaTheDog = (Dog)sasha;

        sasha = new Cat();
        // creates a new downcast instance

        //boolean isDog = sasha instanceof Animal;

        //boolean isAnimal = sasha instanceof Dog;

        //boolean isCat = sasha instanceof Cat;

        feed(rocky);

        feed(sasha);

        feed(sashaTheDog);

    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("MMMM. Dog Food.");
        }
        else if(animal instanceof Cat){
            System.out.println("MMMM. Cat Food.");
        }
        else{
            System.out.println("MMMM. Food.");
        }

        // Shape rectangle = new Shape(); (errors as shape is abstract)
        Shape rectangle = new Rectangle(3,4);
        rectangle.calculateArea();
    }
}
