package at.tim.basics.fernbedienung;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery(100, 90);

        b1.turnOn();
        b1.getStatus();
        b1.turnOff();
    }
}
