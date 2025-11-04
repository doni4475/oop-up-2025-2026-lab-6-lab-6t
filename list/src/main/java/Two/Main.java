package Two;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3.1, 5.7);
        System.out.println("Початкові координати: (" + p.getX() + ", " + p.getY() + ")");

        p.moveTo(1.8, 3.7);
        System.out.println("Нові координати: (" + p.getX() + ", " + p.getY() + ")");
    }
}
