public class p7 {

    public static void main(String[] args)
    {
    //these is mutable string here we have to guve refernce for changes in object
     String s=new String("Sachin");
     s=s.concat("tendulkar");
     System.out.println(s);
    
     // about some mutable strings   here we directly changes the object
    //StringBuilder and StringBuffer


     StringBuffer sb = new StringBuffer("virat");
     System.out.println(sb);
     //StringBuffer sb = " ";   invalid
     sb.append("kohli");
     System.out.println(sb);
     StringBuilder sbr = new StringBuilder("ms");
    
     System.out.println(sbr);
     sbr.append("dhoni");
     System.out.println(sbr);

     

    }
    
}
