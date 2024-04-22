/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Week
{
	public static void main(String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter a week");
	    int i= sc.nextInt();
	    
	   while(true) 
	   if(i==1)
	    {
	    System.out.println("it is monday");   
	        break;
	    }
	   else if(i==2)
	    {
	    System.out.println("it is tuesday");   
	         break;
	    }
	    else if(i==3)
	    {
	    System.out.println("it is wednesday ");   
	         break;
	    }
	    else if(i==4)
	    {
	    System.out.println("it is thursday");   
	         break;
	    }
	   else if(i==5)
	    {
	    System.out.println("it is friday");   
	         break;
	    }
	    else if(i==6)
	    {
	    System.out.println("it is saturday");   
	         break;
	    }
	    else if (i==7)
	    {
	    System.out.println("it is sunday");   
	         break;
	    }
	    else {
	        i -=7;
	    }
	    
	    
	    
	   
	}
}
