
import java.util.Scanner;
public class A {

    int n1 , n2, add , sub , multi , div , rlt; // declaring variable outside the method that's why it is intance variable
public static void main(String[] args)
{
    A ref = new A(); // create object
    ref.input();     // calling method
    ref.process();
    ref.output();


}


void input()
{ 
    Scanner sc = new Scanner(System.in); // taking input from users
   System.out.println("enetr numbers");
   n1 =sc.nextInt();
   n2 =sc.nextInt();
   
}

void process()
{
  add=n1+n2;  ///performing opertions
  sub=n1-n2;
  multi=n1*n2;
  div=n1/n2;


}

void output()
{
 System.out.println("add of numbers are  "   +add);
 System.out.println("sub of numbers are  "   +sub);
 System.out.println("multi of numbers are "  +multi);
 System.out.println("div of numbers are "    +div);



}



    
}
