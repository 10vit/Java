  import java.util.Scanner;
  import java.util.Random;


 public class expg60 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int palpite, num = 0;
        num = rand.nextInt(10) + 1;
        System.out.println("digite seu palpite: ");
        palpite = entrada.nextInt();
        if(palpite == num) {
            System.out.println("voce acertou o numero era " + num);
        }   else{

            if (palpite == num) {
                System.out.println ("seu palpite esta abaixo o numero era " + num);
            } else {
               System.out.println("seu palpite esta acima o numero era " + num);
            }
        }
        entrada.close();
    }

}
