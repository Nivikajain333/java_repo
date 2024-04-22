// inheritance concepts 
// acquiring properties of one class into another one is inheritance

// hepls in code resuability

class Human // parent class , Base class , Super class
{
int age=18;
void sleep()
{
    System.out.println("human need good sleep");

}
}

class Student extends Human  // child class , subclass , derived class
{

public class Inheritance1
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        obj.sleep();
        Student obj2 = new Student();
        obj2.sleep();
        
    }
}


}