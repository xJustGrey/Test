package Array;

import java.util.Scanner;

public class ArrayDop12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.println(pochtoviYashik(email));
    }


    public static String pochtoviYashik(String a) {
        int indexSobaka = a.indexOf('@');
        String pochtoviYashik = a.substring(indexSobaka + 1);
        return pochtoviYashik;

    }
}
