public class Foothill
{
   public static void main (String[] args)
   {
      Dog fido = new Dog(23425);
      Dog lucy = new Dog(9234);
      Dog watson = new Dog(12216);
    
      System.out.println( " Dog Population: " 
            + Dog.getPopulation() ); 
   }
}