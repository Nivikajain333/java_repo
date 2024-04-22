public class Main
{
	public static void main(String[] args) {
	    int n=5;
		for(int j=1; j<n; j++)
		{
		    for(int i=1; i<n; i++)
		    {
		        if(i==j)
		        {
		           System.out.print(j);
		        }
		        else 
		        {
		            System.out.print("1");
		        }
		    }
		   System.out.println(" ");
		}
	}
}
