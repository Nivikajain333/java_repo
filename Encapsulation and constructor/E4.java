
// now for making code more readable we use getter and setter methods
class Student
{
    private int age; 
    private  String name;

  
    public void setAge(int age)

    {
      this.age= age ;     
    
    }
    public int getAge()

    {
      return age;     
    
    }

    public void setName(String name)
    {
      
      this.name = name;
    }

    public String getName()
    {
      
      return name;
    }

    
}

public class E4 {
    public static void main(String[] args)
    {
      Student obj = new Student();
      Student obj1 = new Student();

      obj.setAge(18);
      obj1.setAge(25);
      obj.setName("nivika");
      obj.setName("rishika");
     int stud1Age = obj.getAge();
     String stud1Name = obj.getName();// for getters method
     System.out.println(stud1Age);
     System.out.println(stud1Name);
    }
  
}



