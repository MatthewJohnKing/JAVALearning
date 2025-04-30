package Course2;

public class Animal {
    protected int legs;
    protected String diet;
    protected String behaviour;

    public Animal(int legs, String diet) {
        this.legs = legs;
        this.diet = diet;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public void makeSound(){
        System.out.println("unknown animal sound");
    }
}
