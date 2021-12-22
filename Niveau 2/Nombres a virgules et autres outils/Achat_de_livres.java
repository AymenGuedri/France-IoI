import java.util.Scanner;
class Main {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int somme = input.nextInt();
      
      int prix = input.nextInt();
      
      int result = (int) somme /prix;
       System.out.println(result);

   }

}
