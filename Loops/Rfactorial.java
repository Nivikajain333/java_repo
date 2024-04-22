import java.util.Scanner;

public class Rfactorial {
    public static void main(String[] args) {
        
   
   
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number");
   int num = scan.nextInt();
   int fact = 1;

     for(int i=num; i>=1 ; i--)
     fact = fact*i;
    {
        
      // System.out.print(i + "" + "x" );
    
     System.out.print( +fact);
    }
    



  }  
}






    
    

