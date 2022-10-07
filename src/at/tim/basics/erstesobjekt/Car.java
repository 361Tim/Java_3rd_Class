package at.tim.basics.erstesobjekt;

import java.util.ArrayList;
import java.util.List;

public class Car {
    // Instanz / Gedächtnisvariablen
    private float fuelconsumption;
    private String brand;
    private int honkamounts;
    private int fuelamount;
    private int range;
    private String serialnumber;
    private String color;
    private Engine engine;
    private int speed;
    private List<RearMirror> mirrors;


    public Car(String brand, int fuelconsumption, String serialnumber, int honkamounts, Engine engine, int speed) {
        this.brand = brand;
        this.fuelconsumption = fuelconsumption;
        this.serialnumber = serialnumber;
        this.honkamounts = honkamounts;
        this.engine = engine;
        this.speed = speed;
        this.mirrors = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void drive() {
        this.fuelamount -= this.speed*this.fuelconsumption*0.04;
        if (fuelamount<=0){
            System.out.println("Kein Benzin mehr");
        }
    }

    public void brake() {
        System.out.println("Ich bremse");
    }

    public void boost() {
        float fuealamount2 = this.fuelamount - this.fuelconsumption;
        if (fuealamount2 > this.fuelamount / 10) {
            System.out.println("Superboostmode");
        } else {
            System.out.println("No fuel for boost");
        }
    }

    public void honk() {
        for (int i = 0; i < honkamounts; i++) {
            System.out.println("TuuuuT");
        }
    }

    public float getRemainingRange() {
        float range = this.fuelamount / this.fuelconsumption * 100;
        return range;
    }

    public float getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(float fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHonkamounts() {
        return honkamounts;
    }

    public void setHonkamounts(int honkamounts) {
        this.honkamounts = honkamounts;
    }

    public int getFuelamount() {
        return fuelamount;
    }

    public void setFuelamount(int fuelamount) {
        if (fuelamount>100){
            this.fuelconsumption=100;
        }
        else this.fuelamount = fuelamount;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (fuelamount>100){
            this.speed=100;
        }
        if(speed <= 1){
            this.speed=1;
        }
    }
}
