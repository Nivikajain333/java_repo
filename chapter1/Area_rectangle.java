import java.util.Scanner;
public class Area_rectangle
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    System.out.println("enter width "); 
    double width = scan.nextDouble ();
    System.out.println("enter length "); 
    double length = scan.nextDouble ();
    double Area;
      Area = width * length;
      System.out.println ("area of rectangle " + Area);



  }
}
