
// some rules to override a method

class Aeroplane 
{
    public void takeOff()
    {
      System.out.println("aeroplane is taking off");
    }

    public void fly() 
    {
        System.out.println("aeroplane is flying");
    }
}

class Cargoplane extends Aeroplane
{
    public void fly() // it gives error if we remove public(so we can't decrese visibility)
    {
       System.out.println("cargoplane is flying at lower height");
       // if we change it to public int fly() 
      //  return 10; 
      //this is not possible to chnage return type of child and parent 
    }
    public void carryGoods() 
    {
       
        System.out.println("cargoplane is carrying goods ");
    }

    //public void fly(int x) 
    //{
      // this method is not included in overidden it is consider as  specialized
      // so method overloading can not posiible
    //}
    
}
class Passengerplane extends Aeroplane
{
    public void fly()
    {
        System.out.println("passengerplane is flying at mid height");
    }
    public void carryPassenger() // specilaized method
    {
        System.out.println("carrying passengers");
    }
}

public class RulesOfOveride
{
public static void main(String[] args) {
    Aeroplane ar = new Aeroplane(); // inherited methods
    ar.fly();
    ar.takeOff();

    

}
}