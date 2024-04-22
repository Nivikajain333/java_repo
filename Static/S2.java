// now are understanding  about how  static and non static works simultaneously

public class S2
{
static int a;
static int b;
static
{
    System.out.println("executing static block");
   a=20;
   b=30;
}

static void disp1()
{
    System.out.println("value of a"+" "   +a);
    System.out.println("value of b" +" "  +b);
}

int m=10;
int n=30;
public void disp2()
{
    System.out.println("executing non static block");
    System.out.println("value of m"+ " "   +m);
    System.out.println("value of n" + " "  +n);
}

public static void main(String[] args)
{
    S2.disp1();  // calling static directly through class we do not need to create an object 
    S2 obj = new S2();
    obj.disp2();

}


}