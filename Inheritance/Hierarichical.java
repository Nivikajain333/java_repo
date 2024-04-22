

// hierarichical inheritance 
// it have one parent class and more than one child class aquiring property of parent class

class Animal  // this is also known as object class
// it is parent of all the class
// parent class by default extends object class
{
void sleep()
{
    System.out.println("animal needs sleep");
}
}
class Tiger extends Animal
{

}
class Monkey extends Animal
{

}
class Deer extends Animal
{

}
public class Hierarichical
{
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.sleep();

        Monkey m1 = new Monkey();
        m1.sleep();

        Deer d1 = new Deer();
        d1.sleep();


    }
}
