package Week4.AssignmentsWeek4;

public class Nov30Coin
{

   // constant to represent heads
   private static int HEADS = 1;
   int TAILS =0;

   // current value of the coin
   private int value = 0;

   // method to randomly set the value of the coin to heads or tails
   public void flip()
   {
      if (Math.random() < 0.5)
      {
          value = 0;
      }
      else
      {
         value = 1;
      }
   }

   // return true if the value is heads or false otherwise
   public boolean isHeads()
   {
      return value == HEADS;
   }
   public boolean isTails()
   {
	   return value == TAILS;
   }

   // convert the value to a string
   public String toString()
   {
      if (value == HEADS) 
    	  return "Heads";
      else 
    	  return "Tails";
   }

   // test the class
   public static void main(String[] args)
   {

      Nov30Coin myCoin = new Nov30Coin();
      for (int i = 0; i < 10; i++)
      {
         myCoin.flip();
         System.out.println(myCoin);
         System.out.println(myCoin.isHeads());
         System.out.println(myCoin.isTails());
         System.out.println();
         
      }
   }
}
