 import java.util.Scanner;

  public class expg77 {
      public static void main(String[] args){
          Scanner entrada = new Scanner(System.in);

          char resp;
          String nome;
          int idade;
          resp = 's';

          while (resp == 's') {
              System.out.println("digite o seu nome:");
              nome = entrada.next();
              System.out.println("digite sua idade:");
              idade = entrada.nextInt();

              if (idade >= 18) {
                  System.out.println("seu nome é: " + nome);
              }
              System.out.println("deseja continuar ? (s/n):");
              resp = entrada.next().charAt(0);
          }
          entrada.close();
      }
}
