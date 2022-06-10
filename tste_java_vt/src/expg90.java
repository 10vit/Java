public class expg90 {
    public static void main(String[] args) {

        int contadorFor, contadorWhile;

        //for(inicializaçao;condiçao; decremento)
        for(contadorFor = 10; contadorFor > 0; contadorFor--)
            System.out.println("*");

        System.out.println("");
        contadorWhile = 10; // inicializaçao do while

        //while(condiçao)
        while(contadorWhile > 0) {
            System.out.println("*");
            contadorWhile--; //decretamento do while
        }
    }
}
