public class expg113 {
    public static void main(String[] args) {
        String txt = "ola pessoal do ios ";
        String myStr1 = "hello";
        String myStr2= "hello";

        char result = txt.charAt(0);
        System.out.println("char na posiçao zero; " + result);
        result = txt.charAt(10);
        System.out.println("char na posiçao dez: " + result);

        System.out.println("compara myStr1 com myStr2: " + myStr1.compareTo(myStr2));

        System.out.println("compara txt com myStr2: " + txt.compareTo(myStr2));

        System.out.println("compara myStr1 com txt: " + myStr1.compareTo(txt));

        System.out.println("Verifica inicio da string txt: " + txt.startsWith("Ola"));

        System.out.println("Verifica inicio da string txt: " + txt.startsWith("O"));

        System.out.println("Verifica inicio da string txt: " + txt.startsWith("o"));

        System.out.println("Verifica inicio da string txt: " + txt.endsWith ("IOS"));

        System.out.println("Verifica inicio da string txt: " + txt.endsWith ("S"));

        System.out.println("Verifica inicio da string txt: " + txt.endsWith ("s"));
    }
}
