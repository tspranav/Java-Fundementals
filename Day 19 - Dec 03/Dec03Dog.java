package Week4.AssignmentsWeek4;

public class Dec03Dog
{
    public void speak()
    {
        System.out.println("woof!");
    }

    public static void main(String[] args)
    {
        Dec03Dog d = new Dec03Dog();
        d.speak();
        Dec03Dog b = new Beagle();
        b.speak();
    }
}

class Beagle extends Dec03Dog
{
    public void speak()
    {
        System.out.println("arf arf");
    }
}

