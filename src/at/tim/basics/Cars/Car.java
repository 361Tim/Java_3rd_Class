package at.tim.basics.Cars;

public class Car {
    private String color;
    private int maxspeed;
    private int baseprice;
    private Producer producer;
    private Engine engine;
    private double basefuelconsumption;
    private double newfuelconsumption;
    private int mileage;
    private double newprice;


    public Car(String color, int maxspeed, int baseprice, int mileage, double basefuelconsumption, Engine engine, Producer producer) {
        this.color = color;
        this.maxspeed = maxspeed;
        this.baseprice = baseprice;
        this.mileage = mileage;
        this.basefuelconsumption = basefuelconsumption;
        this.engine = engine;
        this.producer = producer;
    }

    public void fuelconsumption() {
        if (this.mileage > 50000) {
            this.newfuelconsumption = this.basefuelconsumption + this.basefuelconsumption * 9.8 / 100;
        }
    }

    public void newprice() {

        this.newprice = this.baseprice - (this.baseprice * producer.getDiscount() / 100);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(int baseprice) {
        this.baseprice = baseprice;
    }

    public double getFuelconsumption() {
        return basefuelconsumption;
    }

    public void setFuelconsumption(double fuelconsumption) {
        this.basefuelconsumption = fuelconsumption;
    }


    public double getNewprice() {
        return newprice;
    }

    public void setNewprice(double newprice) {
        this.newprice = newprice;
    }

    public double getNewfuelconsumption() {
        return newfuelconsumption;
    }

    public void setNewfuelconsumption(double newfuelconsumption) {
        this.newfuelconsumption = newfuelconsumption;
    }
}
