
    
    

class Student
{
    private int age; // private is use  for encapsulation purpose 
    //age is instance variable here 
    private  String name;

  // here local and instance variable name are same 
  // compiler give prefernce to local this problem is known as shadowing problem
    public void setData(int age)

    // the shadowing problem can be resolve using this keyword
    {
     this.age= age ;     // this keyword is used so that we can make sure compiler that it is instance variable 
    
    }

    public void setData2(String b)
    {
      
      this.name = b;
    }

    public void show() // public means it can be accessible from anywhere any class 
    {
        System.out.println(age+ " "+ name);
    }
}

public class E3 {
    public static void main(String[] args)
    {
      Student obj = new Student();
      Student obj1 = new Student();

      obj.setData(18);
      obj1.setData(25);
      obj.setData2("nivika");
      obj1.setData2("rishika");
      obj.show();

      obj1.show();
    }
  
}




