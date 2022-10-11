package at.tim.basics.fernbedienung;

public class Battery {
    private double chargingstatus1;
    private double chargingstatus2;

    public Battery(double chargingstatus1, double chargingstatus2) {
        this.chargingstatus1 = chargingstatus1;
        this.chargingstatus2 = chargingstatus2;
    }

    public void getStatus() {
        System.out.println("der Batteriestatus beträgt: " + (chargingstatus1 + chargingstatus2) / 2 + "%");
    }

    public void turnOn() {
        this.chargingstatus1 -= 5;
        this.chargingstatus2 -= 5;
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
