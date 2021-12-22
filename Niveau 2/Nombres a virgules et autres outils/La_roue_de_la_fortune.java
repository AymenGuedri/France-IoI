import algorea.Scanner;
 
class Main
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int nbZones = input .nextInt();
      System.out.println(((nbZones % 24) + 24 ) % 24);
   }
}
