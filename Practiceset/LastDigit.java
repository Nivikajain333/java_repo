


// how to find the last two digits of a number of float or integer type 
public class LastDigit
{
	public static void main(String[] args) {
	    
	    float b = (int)12345.67;
	    float c = (int)12345.67;
        float d = (int)12345.67;
	  	 b=(int) b/10;
	  int temp1 = (int)b%10 ; // --> 4
	  	 
	  	 
	  	 c=(int)c%10;
	  	 int temp2 =(int)c*10; // --> 50
	  	 
	     int a = temp1 +temp2;
	  	  System.out.println(a);
	  	 	
	  	 
	  	  	
	  	  	// 45 , 54 use multiply operator 
	  	  	System.out.println((int)d%100);
	  	  	
	  	
	
	
	}
}