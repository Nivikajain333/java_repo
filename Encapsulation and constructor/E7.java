
// concept of constructor overloading
class Student
{
    private int age;
    private String name;

    public void disp()   // display method
    {
        System.out.println(age);
        System.out.println(name);
    }
    
    public Student()    // zero parameterized constuctor
    {
       System.out.println("default constructor");
       name= "nivika";
       age= 19;

    }

    public Student(String name)  // here we have constructor with single parameter
    {
        this.name=name;
        age=20;
    }

    public Student(String name , int age) // constructor with multiple parameter
    {
        this.name=name;
        this.age=age;
    }

}

// so here same constructor name with differnt parameter is known as construtor overloading
public class E7
{
    public static void main(String[] args)
    {

     Student info1 = new Student(); 
     info1.disp();

     Student info2 = new Student("silky");
     info2.disp();

     Student info3 = new Student("pavika", 20);
     info3.disp();

    }
}