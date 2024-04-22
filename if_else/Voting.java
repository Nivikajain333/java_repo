import java.util.*;
public class Voting
{
public static void main (String[]args){
// scanner class object sc
Scanner sc = new Scanner (System.in);
System.out.println("enter age");
int age= sc.nextInt();
if(age>=18)
{
    System.out.println("valid for voting");
}
else
{
    System.out.println(" not valid for voting");
}

}
}