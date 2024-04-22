import java.util.*;
public class Unary {
    public static void main(String[] args )
    {
      int x = 10;
      int a=10;  
      int b=-10; 
      int e = 30; 
      boolean c=true;  
      boolean d=false; 



      System.out.println(x++);//10 (11)  post incrementation
      System.out.println(++x);//12        pre incre
      System.out.println(x--);//12 (11)  post dec
      System.out.println(--x);//10     pre dec
      
         
      System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
      System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
     System.out.println(!c);//false (opposite of boolean value)  
      System.out.println(!d);//true  
      System.out.println("the value is " + !(a<e));
}

}    








      
    
    
