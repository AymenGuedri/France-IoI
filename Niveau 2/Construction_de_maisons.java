import java.util.Scanner ;
class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in) ;

       float cim = input.nextFloat();
       int nb = (int) Math.ceil(cim/60);

       System.out.println(45*nb);

    }
}
