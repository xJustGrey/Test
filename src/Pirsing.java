import java.util.Scanner;

public class Pirsing {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        a = sc.nextInt();
        if (a < 14) {
            System.out.println("Прокол ушей в присутствии родителей");
        } else if (a >= 14 && a < 18) {
            System.out.println("прокпол ушей, пупка, языка, носа в присутствии родителей;");
        } else {
            System.out.println("без ограничений");
        }
    }
}
