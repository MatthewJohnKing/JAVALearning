package Course2;

public class Person {
//public sealed class Person permits Employee, Client{

protected String name;
protected int age;
protected String gender;

    public Person() {
        System.out.println("In person default constructor");
    }

    public Person(String name) {
        System.out.println("In person name constructor");
        this.name = name;
    }

    public String getName(){
    return name;
}

public void setName(String name) {this.name = name;}

    public int getAge(){return age;}

    public void setAge(int age){this.age = age;}

    public String getGender(){return gender;}

    public void setGender(String gender){this.gender = gender;}

    public void increaseAge(){this.age++;}

    public void print(){
        System.out.println("I am a person!");
    }

    public final void changeGender(){
        if (gender.equals("male")) {
            this.gender = "female";
        }
        else{
            this.gender="male";
        }
    }
}
