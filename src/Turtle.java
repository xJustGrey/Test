public class Turtle {
    String name = "";

    public void setName(String n) {
        // write your code here
        name = n;
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.setName("Ivan Arkadievich");
        System.out.println(turtle.name);
    }
}
