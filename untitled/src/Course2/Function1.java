package Course2;

/*
Inheritance is where a class is an extension of another class,
and therefore has the members and functions of the class
the parent is the superclass
the child is the subclass

in the subclass declaration, the class is declared with an extends

rightclicking includes the generate option and has some basic options

private methods are not inherited, only protected and public are.

The superclass default constructor is called at the start of the
subclass default constructor.

to call the superclasses constructor deliberately the use super(Args)
the call to the super class must be the first statement.
the superclass must have an appropriate constructor, at least default.

when overriding a method start before the declarartion with @Override
Remember that when you want to access a method or field from the superclass
it must be protected or public.

overriding and overloading are different.

There can only be one superclass to a subclass, but a subclass can
also be a superclass for a subsubclass. There is a chain of inheritance accordingly.

Private methods and fields are not inherited

Final is a non-access modified that results in a method that can be inherited but not
overridden

overridden methods and fields can not have access modifiers be stricter than in the super
public < protected < private

Sealed classes restrict which other classes may extend them
Sealed is declared before the class declaration!
this is then followed by permits and a , spaced list of the names of allowable subclasses.
subclasses of a sealed class must also be declared as sealed, final or non-sealed
sealed must have defined allowables via permits
final can not have a subclass
non-sealed allows any subclass and obligation is gone to declare

 */
public class Function1 {

    public static void main(String[] args){
        Person person = new Person();
        Employee employee = new Employee();

        //person.
        //employee.
        Employee employee2 = new Employee("Tom");
        employee.setAge(30);
        person.setAge(29);
        employee.setYearsEmployed(2);

        employee.increaseAge();
        System.out.println(employee.getYearsEmployed());
        System.out.println(employee.getAge());

        person.print();
        employee.print("Independant Woman!");
    }
}
