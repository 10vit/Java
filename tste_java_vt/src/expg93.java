public class expg93 {
    public static void main(String[] args) {
        int controle, acumulador = 0;
        boolean condiçao;
        System.out.println("numero da interaçao\tcondiçao\tcontrole\tacumulador");
        for (controle = 1; controle <= 10; controle++) {
            acumulador += controle;
            condiçao = controle <= 10;
            System.out.println("iteraçao " + controle + "\t\t\t" + condiçao + "\t\t\t" + controle + "\t\t\t" + acumulador);
        }
    }
}
