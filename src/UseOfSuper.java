class Parent
{
    void message()
    {
        System.out.println("this is a Parent class");
    }
}
class Base extends Parent
{
    void message()
    {
        System.out.println("this is a base class");
    }
    void display()
    {
 message();
 super.message();
    }
}
public class UseOfSuper {
    public static void main(String[] args) {
Base  p =new Base();
p.display();
Student s = new Student();
    }
}
class Person
{
    Person()
    {
        System.out.println("person class Constructor");
    }
    void display(){

    }
}
class Student extends Person
{
    Student()
    {
        super();
        System.out.println("Student class Constructor ");
    }
}
