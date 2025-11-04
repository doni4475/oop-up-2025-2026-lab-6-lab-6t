package Four;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(10000, 2015, 120);
        Car c2 = new Car(8000, 2018, 110);
        Car c3 = new Car(10000, 2015, 150);

        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(c3));
        System.out.println(c2.compareTo(c1));
    }
}
