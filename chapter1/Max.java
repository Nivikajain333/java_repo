import java.util.Scanner;
class Max

{
    public static void main(String[] args)
    {
    Scanner scan= new Scanner(System.in);
    System.out.println("enter a number");
    int num1 =scan.nextInt();
    
    System.out.println("enter a number");
    int num2 =scan.nextInt();
    if(num1>num2)
    {
        System.out.println("num1 is max number");
        
    }
    else{
        System.out.println("num2 is max number");
    }
    }
}
