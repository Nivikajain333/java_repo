public class obj1
{ 
    int x=4; 
    String a = "ayush" ;
    
    
    /* Syntax of class
                  public Class_name
                  {
                    code
                  } */ 
    public static void main(String[] args) // main method
    {
        Oops my_obj = new Oops();  //object creation using new keyword

       /*  
         class_name object_name = new class_name();
       
       
       */ 

      System.out.println(my_obj.x); //using dot operator calling the object
      System.out.println(my_obj.a);
    }

  
}

