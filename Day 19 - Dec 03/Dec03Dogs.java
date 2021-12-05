package Week4.AssignmentsWeek4;

public class Dec03Dogs
{
    private String name;

    public Dec03Dogs(String name)
    {
        this.name = name;
    }

    public boolean equals(Object other)
    {
    	  Dec03Dogs dog = (Dec03Dogs) other;
          return this.name.equals(dog.name);
    }

    public static void main(String[] args)
    {
        Dec03Dogs d1 = new Dec03Dogs("Rufus");
        Dec03Dogs d2 = new Dec03Dogs("Sally");
        Dec03Dogs d3 = new Dec03Dogs("Rufus");
        Dec03Dogs d4 = d3;
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));
    }
}
