package Week4.AssignmentsWeek4;

public class Dec01Animal {
	static int age=0;
	String colour;
	private String rarity;
	Dec01Animal(){
		System.out.println("It is a dog.");
	}
	Dec01Animal(int legs){
		System.out.println("Cat has "+legs+" legs.");
	}
	Dec01Animal(int legs,int horns){
		System.out.println("Cow has "+legs+" legs and "+horns+" horns.");
		
	}
	Dec01Animal(int legs,int ivory,int trunk){
		System.out.println("Elephant has "+legs+" legs and "+ivory+" ivory and "+trunk+" trunk,");
		
	}
	public String getRarity() {
		return rarity;
	}
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}
	static void IncrementAge() {
		age++;
		System.out.println("Age is incremented "+age+" times.");
	}
	public static void main(String[] args) {
		
		Dec01Animal dog = new Dec01Animal();
		dog.IncrementAge();
		dog.setRarity("Common");
		System.out.println(dog.getRarity());
		
		Dec01Animal cat = new Dec01Animal(4);
		cat.IncrementAge();
		cat.colour = "brown";
		System.out.println(cat.colour);
		
		Dec01Animal cow = new Dec01Animal(4,2);
		cow.IncrementAge();
		
		Dec01Animal Elephant = new Dec01Animal(4,2,1);
		Elephant.IncrementAge();
		Elephant.colour = "grey";
		System.out.println(Elephant.colour);
		Elephant.setRarity("Rare");
		System.out.println(Elephant.getRarity());

	}

}
