
    import java.util.Scanner;
public class Swapping
{
    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x");
        int x = sc.nextInt();
        System.out.println("enter value of y");
        int y = sc.nextInt();
        System.out.println("enter value of z");
        int z = sc.nextInt();
        System.out.println("create a  temp variable");
        int temp;
        temp=z;
        z=x;
        x=y;
        y=temp;
        System.out.println("after swapping value of x is\n"+x);
         System.out.println("after swapping value of y is\n"+y);
         System.out.println("after swapping value of z is\n"+z);
        
        
        
        
    }
}
    

