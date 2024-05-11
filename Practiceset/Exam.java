/* this program is written to check whether a student is allowed to sit in examination or not   */
import java.util.Scanner;
public class Exam
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("no of classes held");
	    int class_held = sc.nextInt();
	     System.out.println("no of classes attend");
		int  class_attend = sc.nextInt();
		System.out.println("percentage of class attend");
	   float percentage =  (class_attend*100) / class_held ;
     	System.out.println(percentage);
        if (percentage <60)
         {
             System.out.println("you are not allowed");
             System. exit(0); // this is used to succesfully exit from the program
         }
         
         System.out.println("you have medical");
         boolean medical = sc.nextBoolean();
         
         // we add something between if and else if  then it will thow an error and it breaks if statemnt
         
          if (percentage >60 && percentage <75 && medical  )
         {
             System.out.println("you are allowed");
    
         }
         
         else 
         {
             System.out.println("you are not allowed");
         }
	}
}
