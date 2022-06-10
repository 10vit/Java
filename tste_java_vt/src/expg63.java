 import java.util.Scanner;
  public class expg63 {
      public static void main ( String [] args) {
          System.out.println("====== menu de opçoes ======");
          System.out.println(" 1 - Cadastrar  produtos ");
          System.out.println(" 2 - listas produtos ");
          System.out.println(" 3 - sair do sistema ");
          System.out.println("====== Escolha uma opção ======");

          Scanner entrada = new Scanner(System.in);
          int menu = entrada.nextInt(); // Lê a opçao digitada

          switch (menu) {
              case 1:
                  System.out.println(" Voce escolheu o menu 1 ");
                  System.out.println(" que é a opçao Cadastrar produtos");
                  break;
              case 2:
                  System.out.println("voce escolheu o menu 2 ");
                  System.out.println("que é a opçao listar produtos ");
                  break;
              case 3:
                  System.out.println("voce escolheu o menu 3 ");
                  System.out.println("que é a opçao sair do sistema ");
                  break;
              default:
                  System.out.println("item de menu invalido ");
          }
          entrada.close();
      }

}
