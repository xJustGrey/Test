import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int upperNumber = 0;
        int lowNumber = 0;
        int popitka;
        int counter = 1;

        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randInt;

        //Сохраняем случайное число в переменной randInt;


        System.out.println("Игра началась");
        System.out.println("Введите нижний предел: ");
        lowNumber = sc.nextInt();
        System.out.println("ВВедите верхний предел: ");
        upperNumber = sc.nextInt();

        randInt = lowNumber + rand.nextInt(upperNumber - lowNumber +1);
        System.out.println("Введите количество попыток: ");
        popitka = sc.nextInt();
        System.out.println("Введите число: ");

        while (counter <= popitka) {
            counter++;
            number = sc.nextInt();
            if (number == randInt) {
                System.out.println("Поздравляю");
                break;
            } else if (number > randInt) {
                System.out.println("Загаданное число меньше");
            } else if (number < randInt) {
                System.out.println("Загаданное число больше");
            }
        }
        System.out.println("Вы не угадали число...");
        System.out.println("Загаданное число " + randInt);
    }
}

