public class P8 {
    //about final keyword and immutability
    public static void main(String[] args)
    {
      int a =10;
      a=20;
      System.out.println(a);
    // final int b = 10;
     // b=20; this is invalid in final keyword
     // final makes the value constant we can not change after once it is given
    // System.out.println(b);

    // now about immutability
    StringBuffer sb = new StringBuffer("virat");
    sb.append("kohli");
    sb = new StringBuffer("sachin");
    System.out.println(sb);
    // after adding final keyword in it we can add another value because the property of immuatble class exist
 // we only cannot give variable

 final StringBuffer sbr = new StringBuffer("virat");
    sbr.append("kohli"); 
   // sbr = new StringBuffer("sachin"); // it gives us erroe
    System.out.println(sbr);
    }
}
