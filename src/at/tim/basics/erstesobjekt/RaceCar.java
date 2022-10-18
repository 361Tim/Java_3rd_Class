package at.tim.basics.erstesobjekt;

public class RaceCar extends Car {
    private String wing;

    public RaceCar(String brand, int fuelconsumption, String serialnumber, int honkamounts, Engine engine, int speed, String wing) {
        super(brand, fuelconsumption, serialnumber, honkamounts, engine, speed);
        this.wing = wing;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }
}
