public class p9 {
    public static void main(String[] args)
    {
    // methods of mutable strings 
    StringBuilder sb = new StringBuilder();
    System.out.print(sb.capacity() + " "); // max capacity of this class
    sb.append("abcdefghijklmnopqrst"); // doubt??/
    System.out.print(sb.capacity() + " ");//how many characters you can add
    System.out.println(sb.length()); // how many characters are present
    

    StringBuilder sb1 = new StringBuilder("sachin");
    System.out.print(sb1.capacity() + "  "); // 16+6 of sachin 22
    System.out.print(sb1.charAt(1)+ " "); 
    //sb1.set charAt(1,'A');
    System.out.print(sb1 + " "); 
    System.out.print(sb1.reverse() + " ");
    System.out.println(sb1.replace(0,3, "ris"));

 
    StringBuilder sb2 = new StringBuilder(150);
    System.out.print(sb2.capacity()+ " "); //capacity of sb2 becomes 150
    sb2.append("java");               // here we append some value 
    System.out.print(sb2.capacity() + " "); // we are having 4 place but capacity is still 150
    sb2.trimToSize();                       // trim the size acc to current value
    System.out.println(sb2.capacity() + " ");

    


    }
    
}
