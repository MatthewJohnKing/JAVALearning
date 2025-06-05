package Course2;

public class Cat extends Animal{

    Cat() {
            super(4, "meat");
            super.behaviour = "Grumpy";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void scratch(){
        System.out.println("Don't touch ME");
    }
}
