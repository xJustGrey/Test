package modul3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {1.3, 3.2, 5.1, 4.7};
        Arrays.sort(array);
        String a = Arrays.toString(array);

        double maxNum = array[array.length - 1];
        System.out.println("Наибольшее число = " + maxNum);
        do {
            System.out.println(a);
        } while (false);
        double copy = 0;
        for (int i = 0; i < array.length; i++) {
            copy += array[i];
        }
        System.out.println("Сумма чисел массива: " + copy);
    }
}