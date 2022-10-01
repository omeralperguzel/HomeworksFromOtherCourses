package PatikaJava101.Practice;

public class DizidekiTekrarEdenCiftSayilariBulma1 {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int[] evennumb = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length ; i++) {
            if (list[i]%2 ==0) {
                evennumb[i]=list[i];
            }
        }

        System.out.println();
        for (int value : evennumb){
            if (value != 0){
                System.out.print(value);
            }
            if (value != 0 && value < evennumb.length){
                System.out.print(", ");
            }
        }
    }
}
