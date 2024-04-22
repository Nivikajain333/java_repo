import java.util.Scanner;

public class Arr1

{
    public static void main (String[] args)
{
   System.out.println("enter a number");
   Scanner scan = new Scanner(System.in); // declaring array using input from user 
  int a[]= scan.nextInt();

 //  int num[] declaring array
  int num[] = { 10, 20, 30 };	// intialisaton of Array int type
	char alpha[] = { 'a', 'b', 'c', 'd' };	// char type
	double deci[] = { 50.0, 30.2, 11.2 };	// double type
	float val[] = { 20.0f, 50.0f };	// float type 
	String name[] = { "Sachin", "hello" };	// string type
	    
	
 // one more method for declaring Array as array is an object we can craete it using new operator
 int nums[] = new int[4];
 nums[0]= 5;
 nums[1]= 4;
 nums[2]= 3;
 nums[3]= 7;

}















}