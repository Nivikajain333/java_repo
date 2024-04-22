/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Leap
{
    public static void main(String[] args)
    {
    Scanner scan= new Scanner(System.in);
    System.out.println("enter a number");
    int i =scan.nextInt();
   
     if(i%4==0)
    {
        System.out.println("leap");
        
    }
    else
    {
        System.out.println("not leap");
    }
    
        
    
    }
}
