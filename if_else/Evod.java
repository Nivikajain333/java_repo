/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// find whether a number is even or odd
import java.util.*; //importing packages
class Evod          
{
    public static void main(String[] args) //main method
    {
    Scanner scan= new Scanner(System.in); //taking input from user
    System.out.println("enter a number");
    int i =scan.nextInt();
   
     if(i%2==0)  
    {
        System.out.println("even");
        
    }
    else
    {
        System.out.println("odd");
    }
    
        
    
    }
}

