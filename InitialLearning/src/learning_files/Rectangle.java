package learning_files;
/*
Objects store data for use in other classes as fields and methods
fields are the global variables
methods are the actions that can be performed on the fields

object classes do not have a main method as it is not for calling,
it is for using elsewhere with these methods
This is a general shell that other classes can use.

the fields do need to be given
set methods. as well as get methods.

Classes should also provide encapsulation
Public; any class can access use or refer to the field
Private; only the current class can access, use or refer to the field
Protected; only other classes in the same package can access etc

Constructors are also required, the first type is the default constructor,
default constructors have no parameter list. Set default values to fields,
default constructors are automaticall given, even when not declared.
constructors do not have a type.
the name must be the same as the class.
more constructors that give different inputs can be added

 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return 2*(length+width);
    }

    public double calculateArea(){
        return length*width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double newLength){
        this.length=newLength;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double newWidth){
        this.width=newWidth;
    }
}
