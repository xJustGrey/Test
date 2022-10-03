package Array;

import java.util.Scanner;

public class ArrayDop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите оценку от 1 до 5");
        String moiOcenki = sc.nextLine();
        String Otlichnik = moiOcenki.replaceAll("2" , "5");
        System.out.println(Otlichnik);
    }
}
