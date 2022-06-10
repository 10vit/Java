public class expg107 {
    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];

        System.out.printf(" a soma dos elemnetos do arrray é: %d%n", total);
    }
}
