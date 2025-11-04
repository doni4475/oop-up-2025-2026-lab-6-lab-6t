package Three;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("+380686681489", 49.8397, 24.0297);

        phone.makeCall();
        phone.receiveCall();

        double[] coords = phone.getCoordinates();
        System.out.println("Поточні координати: " + Arrays.toString(coords));

        phone.setCoordinates(50.4501, 30.5234);
        System.out.println("Нові координати: " + Arrays.toString(phone.getCoordinates()));
    }
}
