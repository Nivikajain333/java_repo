

public class Basic {
   
   public static void Add()
    {
      int a=10 , b=20;
      System.out.println("sum="  +(a+b));
    }

   public static void main(String[] args)
   {
    Basic ref = new Basic();
   ref.disp();
   Basic.Add();
}
   

    void disp()
{
    System.out.println("hello nivi");
}
    
}
