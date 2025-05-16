package Course3;

public class Employee {
    String name;
    String location;
    double salary;
    int age;

    public Employee(String name, String location, double salary, int age) {
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.age = age;
    }

    void raiseSalary(int percent){
        this.salary *= (1+ percent/100);
    }
    void raiseSalary(){
        raiseSalary(20);
    }
}
