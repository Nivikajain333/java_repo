import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number");
   int num = scan.nextInt();
   int fact = 1;

     for(int i=1; i<=num ; i++)
     fact = fact*i;
    {
        
      // System.out.print(i + " " + "x" + "  ");
    
     System.out.print( +fact);
    }

    
    



  }  
}