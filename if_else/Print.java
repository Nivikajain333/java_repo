/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Print
{
	public static void main(String[] args) {
		System.out.println("enter a number");
		
		Scanner sc = new Scanner (System.in);
	    int num = sc.nextInt();
	    if (num%3==0 && num%5==0)
	    {
	        System.out.println("buzzbeep");
	    } 
	    else if (num %5==0)
		{
		   System.out.println("beep");
		}
		else if (num%3==0)
		{
		    System.out.println("buzz");
		}
		
	}
}
