
// here we are understanding about constructors

class Demo
{
    private int a;
    private int b;

    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
    
    public Demo()       // default constructor
    {

    }

    public Demo(int a , int b)    // parameterized constructor
    {
        this.a=a;
        this.b= b;
    }
}







public class E6
{
    public static void main(String[] args)
    {

     Demo obj1 = new Demo(); // zero or no parameterized constructor
     // here we do not need to declare constructor by default it exists
     obj1.disp();

     Demo obj2 = new Demo(10,20);
     obj2.disp();

    }
}