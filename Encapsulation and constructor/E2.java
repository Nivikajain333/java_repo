
// previous code is good for single object 
// but what about if we are having two objects 
class Student
{
    private int age; 
    private  String name;

  // here local and instance variable name are same 
  // compiler give prefernce to local this problem is known as shadowing problem


    public void setData(int age) // we are passing parameter here so that value can directly passed
    
    {
      age= age ;     // we are assingng value of age(local variable) to age(instance) variable
    
    }

    public void setData2(String name)
    {
      
      name = name;
    }

    public void show() // public means it can be accessible from anywhere any class 
    {
        System.out.println(age+ " "+ name);
    }
}

public class E2 {
    public static void main(String[] args)
    {
      Student obj = new Student();
      Student obj1 = new Student();

      obj.setData(18);
      obj1.setData(25);
      obj.show();

      obj1.show();
    }
  
}


