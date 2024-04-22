// this is multilevel inheritance 



class Demo1 // parent class
{
    void disp()
    {
        System.out.println("disp Demo1");
    }
}
class Demo2 extends Demo1  // demo2 is child class
{
    
}
class Demo3 extends Demo2 // demo3 is child class
{
    
}
public class Multilevel
{
    public static void main(String[] args){
        Demo3 obj = new Demo3();
        obj.disp();


    }
}