
public class P1 {

    public static void main(String [] args)
    {
       //collection of characters are string
     String brand = "pwskills"; 
     System.out.println(brand);
     brand.concat("bengluru"); //this is immutable string
     System.out.println(brand);
     
     StringBuilder brand1 = new StringBuilder("pw ");
     System.out.println(brand1);
     brand1.append("bengluru");  //this is mutable string
     System.out.println(brand1);






    }
    
}
