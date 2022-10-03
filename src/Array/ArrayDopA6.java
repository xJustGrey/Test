package Array;

public class ArrayDopA6 {
    public static String string = "hello world";

    public static void main(String[] args) {
        System.out.println(string);

        while (string.length() > 2) {
            string = string.substring(1, string.length() - 1);
            System.out.println(string);
        }
    }
}
