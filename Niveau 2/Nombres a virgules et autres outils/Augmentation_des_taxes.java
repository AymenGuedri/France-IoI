import  java.util.Scanner;
class Main{


   public static void main(String[] args) {
       Scanner input= new Scanner(System.in);

          double valeurA = input.nextDouble();
          double valeurN = input.nextDouble();
          double prixA = input.nextDouble();

      double PrixN = prixA / ( 1 + valeurA / 100) * (1 + valeurN / 100);

        PrixN = (double) Math.round(PrixN * 100) / 100;



      System.out.println(PrixN);


   }

}
