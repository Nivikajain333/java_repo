
// now let's learn about static 

// static members and static intialization block will be executed during class loading itself

public class S1
{

static int a;   // static members or variable
static{  
                // static block
    System.out.println("static block");
    a=10;
    System.out.println(a);
}

public static void main(String[] args)
{
    System.out.println("main method");
}

}
