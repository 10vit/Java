 import java.util.Scanner;
   public class expg66 {
       public static void main ( String [] args ) {

            System.out.println( "====== Calculadora ======" );

            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            double num1 = entrada.nextDouble(); //le a opçao digitada
           System.out.println("Digite outro numero: ");
           double num2 = entrada.nextDouble(); //le a opçao digitada
           System.out.println("======= operaçao matematica ======= ");
           System.out.println(" + Adicionar os numeros ");
           System.out.println(" - subtrair os numeros ");
           System.out.println(" * multiplicar os numeros ");
           System.out.println(" ======== escolha uma opçao ======== ");
           String oper = entrada.next(); // le a opçao digitada

           switch (oper) {
               case "+":
                   double soma = num1 + num2;
                   System.out.println("voce escolheu adiçao ");
                   System.out.println("o numero " + num1 + " + " + num2 + "=" + soma);

                   break;
               case "-":
                   double sub = num1 - num2;
                   System.out.println("voce escolheu subtraçao ");
                   System.out.println("o numero " + num1 + " - " + num2 + " = " + sub);

                   break;
               case "*":
                   double mult = num1 * num2;
                   System.out.println("voce escolheu multiplicaçao ");
                   System.out.println("o numero " + num1 + " * " + num2 + " = " + mult);

                   break;
               default:
                   System.out.println("operaçao nao diponivel ou invalida");
           }
           entrada.close();
       }
 }
