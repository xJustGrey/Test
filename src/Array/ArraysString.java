package Array;

public class ArraysString {
    public static void main(String[] args) {
        String name1 = "Вован Иванов";
        String name2 = "пван иванов";
        checkUserName(name1, name2);
    }
        public static void checkUserName(String name1, String name2) {
            String name1copy = name1.replace(" ","");
            if (name1.equalsIgnoreCase(name2)==true) {

                System.out.println("Выберите другое имя");
            } else {
                System.out.println("Отличное имя");
                System.out.println("Ваше имя имеет длину" + " " + name1.length() + " " + "символов");
                System.out.println("А без пробелов ваше имя занимает " + name1copy.length() + "символов");
            }
        }
    }

