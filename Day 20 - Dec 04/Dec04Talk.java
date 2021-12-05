package Week4.AssignmentsWeek4;

public class Dec04Talk
{
    public static void talk()
    {
          System.out.println("hello there!");
    }

    public static void talk(String s) {
    	System.out.println("Hello "+s);
    }

    public static void main(String[] args)
    {
    	Dec04Talk t = new Dec04Talk();
          t.talk("Matthew");
    }
}

