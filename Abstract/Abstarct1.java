
// it is herarichal inheritance
class Aeroplane3
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

class CargoPlane3 extends Aeroplane3
{

    public void takeOff()
    {
        System.out.println("Cargoplane requires longer runway");
    }
    public void fly()
    {
        System.out.println("Cargoplane flies at lower height");
    }
}

class PassengerPlane3 extends Aeroplane3
{

    public void takeOff()
    {
        System.out.println("passenger plane requires medium size runway");
    }
    public void fly()
    {
        System.out.println("passenger plane fly at medium height ");
    }
}

public class Abstarct1
{
    AeroPlane3 ref1 = new CargoPlane3();
    ref1.takeOff();
    ref1.fly();

    AeroPlane3 ref3 = new PassengerPlane3();
    ref3.takeOff();
    ref3.fly();

}
