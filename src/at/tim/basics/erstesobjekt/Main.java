package at.tim.basics.erstesobjekt;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand= "Audi";
        c1.fuelconsumption = 7;
        c1.serialnumber = "A1234";

        System.out.println(c1.serialnumber);
    }
}
