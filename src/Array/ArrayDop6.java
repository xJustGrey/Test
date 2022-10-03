package Array;

import java.util.Scanner;

public class ArrayDop6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isCorrectName = false;
        String name = "";
        while (!isCorrectName) {
            name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
        System.out.println("Слово наоборот - " + reverse(name));
    }

    private static String reverse(String name) {
        String str = "";
        for (int i=name.length()-1; i>=0; i--) {
            str += name.charAt(i);
        }
        return str;
    }

    private static boolean checkName(String name) {
        if (name.split(" ").length == 1) {
            return true;
        } else return false;
    }
}
