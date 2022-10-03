import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double val1;
        double val2;
        char operand;
        char calculateOperator = 'c';
        double result = 0;

        do {
            if (calculateOperator == 'c') {
                System.out.print("Введите первый операнд ");
                val1 = scanner.nextDouble(); // считывает первый операнд
                System.out.print("Введите оператор");
                operand = scanner.next().charAt(0); /*Метод next() класса Scanner считывает строку,
        а метод charAt(0) позволяет взять первый символ в этой строке.
        так мы получаем операцию, которую нужно выполнить*/
            } else {
                val1 = result;
                operand = calculateOperator;
            }
            System.out.println("Введите второй операнд");
            val2 = scanner.nextDouble(); // считывает второй операнд

            result = calculate(val1, val2, operand);
            System.out.println(val1 + " " + operand + " " + val2 + " " + "=" + result);
            calculateOperator = scanner.next().charAt(0);
        } while (calculateOperator != 's');


    }

    public static double calculate(double val1, double val2, char operand) {
        return switch (operand) {
            case '+' -> val1 + val2;
            case '-' -> val1 + val2;
            case '*' -> val1 + val2;
            case '/' -> val1 + val2;
            default -> {
                System.out.println("Wrong operand");
                yield 0;
            }
        };
    }
}
