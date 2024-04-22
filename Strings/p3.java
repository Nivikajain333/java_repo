

public class p3 {

    public static  void main(String [] args)

    {
     // comparsions of strings with the help of two operators
    // == and equals


    String s1 = "pwskill";
    String s3 = "pwskill"; 
    String s2 =  new String ("pwskill");

    System.out.println(s1==s2); //it comapres refernce of object
    System.out.println(s1.equals(s2)); // it compares value of objectts
    System.out.println(s1==s3); 
    System.out.println(s1.equals(s3));
    }
    
}
