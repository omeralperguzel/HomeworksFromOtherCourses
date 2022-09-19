package PatikaJava101.Practice;

public class DizidekiElemanlarinOrtalamasiniBulanProgram {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5, 6};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + (1 / numbers[i]);
            System.out.println(i + ". sıra, " + "Toplam:\t" );
            System.out.format("%.2f", sum);
            System.out.println();
        }

        System.out.print("Harmonik ortalama: ");
        System.out.format("%.2f", sum/numbers.length);
    }
    
}
