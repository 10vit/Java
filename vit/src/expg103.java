import java.util.Scanner;

public class expg103 {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);

    int maior;
    int[] numeros = new int[5];

    int tamanho = numeros.length;

    for (int i = 0; i < tamanho; i++){
    System.out.println("digite um numero: ");
    numeros[i] = entrada.nextInt();
     }
    maior = numeros[0];

    for (int i = 0; i < tamanho; i++) {
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
    }
    System.out.println("o maior numero é: " + maior);
    entrada.close();
  }
}
