/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Month
{
	public static void main(String[] args)
	{
	    
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter a month");
	    String str= sc.nextLine();
	    
	    if(str=="jan"|| str=="mar" ||str=="may" ||str=="july" ||str=="aug" ||str=="oct" ||str=="dec")
	    {
	        System.out.println("days are 31");
	    }
	    else if(str=="april"|| str=="june" || str=="sep" || str=="nov" )
	     {
	        System.out.println("days are 30");
	    }
        else if (str=="feb")
	    {
	        System.out.println("days are 28");
	    }
	}
}

