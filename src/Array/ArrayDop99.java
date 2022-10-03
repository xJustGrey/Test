package Array;

public class ArrayDop99 {
    public static void main(String[] args) {
        int[] arr = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};
        int flag;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    flag = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = flag;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
