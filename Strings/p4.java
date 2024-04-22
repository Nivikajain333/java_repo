

public class p4 {

    public static void main(String[] args )
    {
// concatenat strings or adding two or more srings and creating  new string
   // we can done it by +operator  string.concat() method
     
      String s1 = new String("pw");
       s1.concat("skill");
      System.out.println(s1); //it does not concatinate the string because it is immutable string
     // here we can't chnage value 
     
     String s2 = new String("pw");
      s2 =  s2.concat("skill");
      System.out.println(s2); // here we use refernce instead of changing value we change refernce
  
      String s3 = "Pwjava"; //scp
      String s4 = s3.concat("pw"); // in heap because we have inbuild method
       
       String s5 = new String("pwjava");
        s5 = s5.concat("skill ");  // just changing the refernce

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }

    
}
