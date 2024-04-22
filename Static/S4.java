
// static block vs non static block or java instialization block
public class S4 {

    static int age; // first execution

    static         // second execution
    {
     System.out.println("static block");
     age=17;

    }
    static void disp()
    {
        System.out.println(" disp static method ");
        System.out.println(age);
    }
    public static void main(String[] args)   // 3rd execution
    {
        System.out.println(" non static method ");
        S4.disp();

    }

    
}
