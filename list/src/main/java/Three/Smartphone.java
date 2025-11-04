package Three;

public class Smartphone implements GPS, Cellular {

    private double latitude;
    private double longitude;
    private String phoneNumber;

    public Smartphone(String phoneNumber, double latitude, double longitude) {
        this.phoneNumber = phoneNumber;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public double[] getCoordinates() {
        return new double[]{latitude, longitude};
    }

    @Override
    public void makeCall() {
        System.out.println("Дзвінок " + phoneNumber);
    }

    @Override
    public void receiveCall() {
        System.out.println("Прийняти дзвінок " + phoneNumber);
    }

    public void setCoordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
