package Week4.AssignmentsWeek4;

public class Dec04Candy
{
    public String taste()
    {
        return "tastes sweet!";
    }
 
    public static void main(String[] args)
    {
    	Dec04Candy c1 = new Dec04Candy();
        System.out.println(c1.taste());
        Dec04Candy c2 = new Chocolate();
        System.out.println(c2.taste());
    }
}
 
class Chocolate extends Dec04Candy
{
	public String taste() {
		return "tastes chocolately";
		
	}
}

