class Demo1
{
    int a,b;
    public Demo1()
    {
        System.out.println("parent class constructor");
    }

    public Demo1(int x, int y)
    {
        System.out.println("parent class parameterized constructor");
        a=x;
        b=y;
    }
}

class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {
       // super(10,20); //by default (calls parent class constructor)
       this(10,20);
        System.out.println("child class constructor");
    }
    public Demo2(int x , int y)
    {
     System.out.println("child class parameterized constructor");
     m=x;
     n=y;
    }
}

public class ConstructorInheritance
{
    public static void main(String[] args) {
        
       Demo2 obj = new Demo2();

     //   Demo2 obj2 = new Demo2(10,20);

     //this will return parent class constructor becuase we call super method and it has no parameters
        }
}