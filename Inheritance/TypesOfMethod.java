// Methods of inheritance in java 
// inherited , overide , specialized


class Aeroplane 
{
    public void takeOff()
    {
      System.out.println("aeroplane is taking off");
    }

    public void fly()  // overidden of fly method
    {
        System.out.println("aeroplane is flying");
    }
}

class Cargoplane extends Aeroplane
{
    public void fly()
    {
        System.out.println("cargoplane is flying at lower height"); // overiding of fly method
    }
    public void carryGoods() // specialized method
    {
       
        System.out.println("cargoplane is carrying goods ");
    }
    
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
public class TypesOfMethod
{
public static void main(String[] args) {
    Aeroplane ar = new Aeroplane(); // inherited methods
    ar.fly();
    ar.takeOff();

    Cargoplane cr = new Cargoplane();
    cr.fly();
    cr.takeOff();

    Passengerplane pp = new Passengerplane();
    pp.fly();
    pp.takeOff();
    

}
}