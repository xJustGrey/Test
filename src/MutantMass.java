import java.util.Scanner;

public class MutantMass {
    public static void main(String[] args) {
        double height;
        double weight;
        double resHeight;
        double result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите рост (в сантиметрах): ");
        height = sc.nextDouble(); // считываем рост
        System.out.println("Введите вес: ");
        weight = sc.nextDouble(); // считываем вес
        resHeight = height / 100;
        result = weight / (resHeight * resHeight);
        System.out.println(result);
        if (result < 18.5) {
            System.out.println("Чахлик");
        }
        if (result >= 19 && result <= 25) {
            System.out.println("Уже не чахлик, но жрать надо больше");
        }
        if (result > 25 && result < 30) {
            System.out.println("В самый раз");
        }
        if (result > 30) {
            System.out.println("Зашей себе рот");
        }

    }
}
