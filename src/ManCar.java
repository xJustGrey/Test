public class ManCar {
    public static void main(String[] args) {
        Car mazda = new Car();
        Car lada = new Car("Lada", 123, false, 20);
        mazda.countSpeed(5);
        lada.countSpeed(5);
        System.out.println(mazda.countSpeed(5));
        System.out.println(lada.countSpeed(5));


    }
}
