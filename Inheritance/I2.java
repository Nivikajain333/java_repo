

class Human {


    private String name; // encpasulation can not participate in inheritance
     int age;

     Human()  // class constructor
     {
      System.out.println("human class constructor");
     }
     void sleep()
     {
        age=18;
         System.out.println("human needs good sleep");
         System.out.println(age);
     }
     void disp()
     {
        System.out.println("the Age is :" +age);
     }
    }
    
     class Student1 extends Human
     {
        // public student()
        //{
            //super(); this keyword is used for calling a constructor in parent class
        //}
     }

    
     public class I2
     {
         public static void main(String[] args){
             Student1 obj = new Student1(); // object of student class 
             obj.sleep();
             obj.disp();
         }
     }
     
 
 
