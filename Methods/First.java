public class First{

int m=20;
int n=30;
void add()
{
    int x=m+n;
    System.out.println("added value is ");
    System.out.println(x);
    
}

    public static void main(String[] args)
    {
        System.out.println("my first file ");
        First f1 =new First();
        f1.add();
        System.out.println("calling function from aonther class from seperate file ");
        Third t1 = new Third();
        t1.show();

    }

}
