public class p10 {
    public static void main(String[] args)
    {

     String s1 = "Nivika";  // 78 ascii value of N
     String s2 = "Rishika"; // 82 ascii value of R
     System.out.print(s1.compareTo(s2)+ " "); // 78-82


     String s3 =  "Rishika";  // 82 ascii value of R
     String s4 = "Nivika";  // 78 ascii value of N
     System.out.print(s3.compareTo(s4)+ " "); // 82-78


     String s5 = "Nivika"; // 78 ascii value of N
     String s6 = "Nivika";
     System.out.println(s5.compareTo(s6)); // 

     String s = " SACHIN TENDULKAR ";
     System.out.println(s.trim()+" ");
     System.out.print(s.length()+ " ");
      System.out.print(s.trim().length());
    



    }
    
}
