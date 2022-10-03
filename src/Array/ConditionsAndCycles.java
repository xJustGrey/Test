package Array;

public class ConditionsAndCycles {
    public static void main(String[] args) {
        int a = 4, b = 3, c = 2;
        b = b + c; //5
       // a = a * b; //20 -
        c = a - c; //2
        // a = a + b; //25 -
        a = a - b; //-1
        c = a + b; //1
        //b = c / a; //1м-
        a = b + c; //6
        a = a + c + b; //52

        System.out.println(c);

        // Напишите здесь свой код
    }
}
