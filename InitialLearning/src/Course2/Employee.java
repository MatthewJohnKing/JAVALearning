package Course2;

// public class Employee extends Person{
public final class Employee extends Person {

private int employeeID;
private String jobTitle;
private int yearsEmployed;

    public Employee() {
        System.out.println("In Employee default constructor");
    }

    public Employee(String name) {
        super(name);
        System.out.println("In Employee name constructor");

    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getYearsEmployed() {
        return yearsEmployed;
    }

    public void setYearsEmployed(int yearsEmployed) {
        this.yearsEmployed = yearsEmployed;
    }

    @Override
    public void increaseAge(){
        super.age++;
        this.yearsEmployed++;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
