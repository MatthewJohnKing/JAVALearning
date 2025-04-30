package Course2;

public class Dog extends Animal{
    protected String sound;

    Dog(){
        super(4,"meat");
        sound="woof";
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    public void fetch(){
        System.out.println("Fetch is fun!");
    }
}
