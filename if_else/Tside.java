import java.util.*;
public class Tside
{
public static void main (String[]args){
// scanner class object sc
Scanner sc = new Scanner (System.in);
System.out.println("enter a value of a");
int a= sc.nextInt();
System.out.println("enter a value of b");
int b= sc.nextInt();
System.out.println("enter a value of c");
int c= sc.nextInt();

if(a==b && b==c && a==c)
{
    System.out.println("it is equilateral triangle");
}
else if( a==b || b==c || a==c)
{
    System.out.println("it is isoscles triangle");
}
if(a!=b && b!=c && a!=c)
{
    System.out.println("it is scalene triangle");
}


}
}