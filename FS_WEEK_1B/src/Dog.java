
public class Dog {
   private static long population;  // private static member
   private long licenseNumber;     // private instance member

   public Dog(int licNum)
   {
      if (licNum > 0)
         licenseNumber = licNum;
      else
         licenseNumber = 0;
      population++;
   }

   public static long getPopulation()
   {
      return population;    
   }
}
