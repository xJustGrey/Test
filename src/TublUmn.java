public class TublUmn {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int f = 0; f < 10; f++) {
                if (f == 0) {
                    System.out.print(i + "  ");
                } else {
                    System.out.print(" " + i * f + " ");
                }
            }
            System.out.println();
        }
    }
}
