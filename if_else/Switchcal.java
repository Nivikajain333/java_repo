import java.util.*;
public class Switchcal
{
public static void main (String[]args){
// scanner class object sc
System.out.println("enter a number1 and number2");
Scanner sc = new Scanner (System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
System.out.println("enter operator");
char operator = sc.next().charAt(0);



//System.out.printf("enter value to \nadd -> 1" + "\n" + "sub -> 2" + "\n" + "multiply -> 3" + "\n" + "division -> 4 \n");


switch(operator)
 {
  case '+' : 
    
    System.out.println(num1+num2);

    break;

  case '-':
    
    System.out.println( num1-num2);
 break;

  case '*':
     
    
    System.out.println(num1*num2);

    break;
  case '%' :
  
       
  System.out.println( num1 / num2);

    break;
 default : System.out.println( "wrong operator");
}
}
}