package Array;

import java.util.Scanner;


public class ArrayDop9 {
    public static void main(String[] args) {
        String[] text = {"Жили-были старик со старухой.\n" +
                "\n" +
                "Вот и говорит старик старухе:\n" +
                "\n" +
                "— Поди-ка, старуха, по коробу поскреби, по сусеку помети, не наскребешь ли муки на колобок."};


        for (String a : text) {
            System.out.println(a);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("МЕНЮ");
        System.out.println("Выберите один из предложенных вариантов");
        System.out.println("1. Удалить пробелы.\n" +
                "2. Сделать все заглавными или строчными.\n" +
                "3. Посчитать количество символов.");
        System.out.println("Введите выбранное действие");
        char word = sc.next().charAt(0);

        switch (word) {
            case '1':
                for (int i = 0; i < text.length; i++) {
                    text[i] = text[i].replaceAll(" ", "");
                    System.out.println(text[i]);
                }
                break;
            case '2':
                for (int i = 0; i < text.length; i++) {
                    text[i] = text[i].toUpperCase();
                    System.out.println(text[i]);
                }
                break;
            case '3':
                for (int i = 0; i < text.length; i++) {
                    System.out.println(text[i].length());
                }
                break;
            default:
                System.out.println("Неверная команда");
        }
    }
}

