import java.util.Scanner;

public class ProverkaName {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean isCorrectName = false;
            while (!isCorrectName) {
                String name = scanner.nextLine(); //Считывает строку из System.in
                isCorrectName = checkName(name);
                if (!isCorrectName) System.out.println("Введите корректное имя!");
            }
        }

        private static boolean checkName(String name) {
            //Написать код здесь
            String[] pass =name.trim().split(" ");
            return pass.length == 3;
        }
    }
}