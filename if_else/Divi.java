import java.util.*;
class Divi  //check whether a number is divisable by 3 or not
{
    public static void main(String[] args)
    {
    Scanner scan= new Scanner(System.in);
    System.out.println("enter a number");
    int i =scan.nextInt();
   
     if(i%3==0)
    {
        System.out.println("divisable by 3");
        
    }
    else
    {
        System.out.println("not divisable");
    }
    
        
    
    }
}
