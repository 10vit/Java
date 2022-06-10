public class expg96 {
    public static void main(String[] args) {
        int controle = 1;
        long acumulador = 100;
        boolean condiçao;
        System.out.println("numero da iteraçao\tcondiçao\tcontrole\tacumulador");
        do{
            acumulador -= controle;
            condiçao = controle <=10;
            System.out.println("Iteraçao " + controle+ "\t\t\t"+ condiçao + "\t\t\t" + controle + "\t\t\t" + acumulador);
            controle++;
        }while(controle <=10);
    }// fim do metodo main
}
