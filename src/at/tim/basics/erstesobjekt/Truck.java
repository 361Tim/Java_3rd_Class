package at.tim.basics.erstesobjekt;

public class Truck extends Car {
    private String trailer;

    public Truck(String brand, int fuelconsumption, String serialnumber, int honkamounts, Engine engine, int speed, String trailer) {
        super(brand, fuelconsumption, serialnumber, honkamounts, engine, speed);
        this.trailer = trailer;
    }

    public void drive() {
        System.out.println("I am driving the Truck");
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailor) {
        this.trailer = trailer;
    }

}
