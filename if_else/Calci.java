import java.util.Scanner;
public class Calci
{
public static void main (String[]args){
// scanner class object sc
System.out.println("enter number1 and number2");
Scanner sc = new Scanner (System.in);

int num1 = sc.nextInt();
int num2 = sc.nextInt();


int i;


System.out.printf("enter value to \nadd -> 1" + "\n" + "sub -> 2" + "\n" + "multiply -> 3" + "\n" + "division -> 4 \n");
i = sc.nextInt();
if (i==1)
{
    float add = num1 + num2 ;
    System.out.println(add + "add the given values");
}
 else if (i==2)
{   
    float sub = num1 - num2 ;
    System.out.println( sub + "sub the given values");

}
 else if (i==3)
{   
    float multi = num1 * num2 ;
    System.out.println(multi + "multi the given values");
}
else if(i==4)
{  
    System.out.println( divi + "divide the given values");
}
float divi = num1 / num2 ;
    System.out.println( divi + "divide the given values");
}

}
}