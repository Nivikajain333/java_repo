

public class P2 {
    
    public static void main(String[] args)
    {

    String s1 = "pw"; // they are generated inside heap in the string constant pool
    String s2 = "pw"; //the duplicate value are not allowed so this two refernces refer to one value

    String s3 =  new String ("pwskill");  //here duplicate values are allowed inside heap
    String s4 =  new String ("pwskill");


    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);


    
    
    }
}
