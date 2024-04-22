/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Case
{

public static void main (String[] args) 
{
  Scanner sc= new Scanner(System.in);
  System.out.println("enter a character ");
  char ch= sc.next().charAt(0);
  if (ch>='a'&& ch<='z')
  {
      System.out.println( "it is in lowercase");
  }
  
  else if(ch>='A'&& ch<='Z')
  {
      System.out.println("it is uppercase");
  }
  
}

}

