import algorea.Scanner;
import static java.lang.Math.*;
 
class Main
{
   public static void main(String[] args)
   {
      Scanner entrée = new Scanner(System.in);
      int populationActuelle = entrée.nextInt();
      double croissancePourcent = entrée.nextDouble();
      int populationFuture =
         (int)floor( populationActuelle * (1 + croissancePourcent / 100) );
      System.out.println(populationFuture);
   }
}
