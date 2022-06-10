 import java.util.Scanner;
public class expg51 {
    public static void main (String [] args) {

        // intancia do objeto (buffer) utiçizando a classe Scanner

        Scanner entrada = new Scanner(System.in);
        int pontos = 0;
        System.out.println("digite o numero de pontos de jogador: ");
        pontos = entrada.nextInt();

        if (pontos >= 1000) {

            System.out.println("voce passou pra fase 2");
        }
            System.out.println("proxima instruçao ");

            entrada.close();
        }
    }

