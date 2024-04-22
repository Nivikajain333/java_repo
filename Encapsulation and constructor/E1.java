
// basic about encapsulation 
// private memebers 
class Student
{
    private int age; //  private is used  for encapsulation purpose
    // here age is intance variable
    private  String name;


    public void setData()
    {
      age= 18;
      name = "rahul";
    }

    public void show() // public means it can be accessible from anywhere any class 
    {
        System.out.println(age+ " "+ name);
    }
}

public class E1 {
    public static void main(String[] args)
    {
      Student obj = new Student();
      obj.setData();
      obj.show();
    }
  
}

