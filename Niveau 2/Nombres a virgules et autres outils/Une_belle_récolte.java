import java.util.Scanner;
class Main {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int nbPersonnes = input.nextInt();
      int nbFruits = input.nextInt();
      
      if(nbFruits % nbPersonnes ==0) {
         System.out.println("oui");
      }
      else
      {
         System.out.println("non");
      }

   }

}
