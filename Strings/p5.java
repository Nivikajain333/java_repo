

public class p5 {

    public static void main(String[] args)

{
// we can concatinate many objects at a time using + operator
String s1 = "pw";
String s2 = "pw" + "java";
String s3 = "pw" + "java" + "blr" ; // these are in scp
String s4 = s1+ s2; // in heap area  
 
String s5 = "pw";
String str = "pw" + 100 + 99;
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
System.out.println(str);

}    
}
