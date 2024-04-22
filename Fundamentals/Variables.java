

public class Variables {

     int a = 10; // instance variables
     static int b =20; // static variable
    public static void main(String[] args )
    {
      int c=30;  // local 
      Variables ref = new Variables();
      // How to access these variables 
      System.out.println(c); // local variable
      System.out.println(Variables.b); // static 
      System.out.println(ref.a);  // instance 
 
    }
}
