package Week4.AssignmentsWeek4;

public class Nov30Person
{
   // fields
   private String name;
   private String email;
   private String phoneNumber;

   // constructor
   public Nov30Person(String theName)
   {
      this.name = theName;
   }
   public Nov30Person(String name,String email) {
	   this.name = name;
	   this.email = email;
   }
   public Nov30Person(String name,String email,String ph) {
	   this.name = name;
	   this.email = email;
	   this.phoneNumber = ph;
   }

   // methods - getters
   public String getName() { return this.name;}
   public String getEmail() { return this.email;}
   public String getPhoneNumber() { return this.phoneNumber;}

   // methods - setters
   public void setName(String theName) { this.name = theName;}
   public void setEmail(String theEmail) {this.email = theEmail;}
   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
   public String toString()
   {
      return this.name + " " + this.email + " " + this.phoneNumber;
   }

   // main method for testing
   public static void main(String[] args)
   {
      Nov30Person p1 = new Nov30Person("Sana");
      System.out.println(p1);
      
      Nov30Person p2 = new Nov30Person("Jean","j@hjh");
      System.out.println(p2);
      
      Nov30Person p3 = new Nov30Person("pranav","tsp","879");
      System.out.println(p3);
   }
}

