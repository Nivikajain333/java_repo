/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Max  
{  //check max number among 3
    public static void main(String[] args)
    {
    Scanner scan= new Scanner(System.in);
    System.out.println("enter a number");
    int num1 =scan.nextInt();
    System.out.println("enter a number");
    int num2 =scan.nextInt();
    System.out.println("enter a number");
    int num3 =scan.nextInt();
    if(num1>num2 && num1>num3 )
    {
        System.out.println("first is max number");
        
    }
    else if(num2>num3){
        System.out.println("second is max number");
    }
    else {
        System.out.println("third is max number");
        
    }
    }
}
