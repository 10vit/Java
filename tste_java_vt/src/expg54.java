 import java.util.Scanner;

public class expg54 {
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println ("digite um numero inteiro: ");
        numero = entrada.nextInt();

        if ((numero % 2) == 0) {
            System.out.println ("o numero " + numero + "é par");
        }
        else {
            System.out.println("o numero " + numero + "é impar");
        }
        entrada.close();
    }
}
