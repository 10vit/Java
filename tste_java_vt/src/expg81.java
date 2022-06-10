  import java.util.Scanner;
  import java.util.Random;

 public class expg81 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

         Random rand = new Random();
         int palpite,num = 0;
         num = rand.nextInt(10) + 1;

         do {
             System.out.println("digite seu palpite: ");
             palpite = entrada.nextInt();
             if (palpite < num) {
                 System.out.println("Voce acertou");
             }else {
                 if (palpite < num) {
                     System.out.println("Seu palpite esta abaixo" );
                 }else {
                     System.out.println("seu palpite esta abaixo");
                 }
             }

         } while (palpite != num);
         entrada.close();
     }
}
