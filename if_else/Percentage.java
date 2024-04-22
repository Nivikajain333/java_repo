 import java.util.*;
 public class Percentage
 {
 public static void main (String[]args){
 // scanner class object sc
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter The Five Subject Marks :");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		int tot = m1+m2+m3+m4+m5;
		float per = tot/5;

        System.out.println("Total :"+tot);
		System.out.println("Percentage :"+per);	
		if(per>=60)
		{			
			System.out.println("First Division.");
		}
		else if(per>=45 && per<60)
		{			
			System.out.println("Second Division.");
		}
		else if(per>=30 && per<45)
		{			
			System.out.println("Third  Division.");
		}
		else
		{			
			System.out.println("Fail.");
		}
	}
}

 
 
 
