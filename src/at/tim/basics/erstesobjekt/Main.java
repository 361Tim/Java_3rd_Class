package at.tim.basics.erstesobjekt;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand= "Audi";
        c1.fuelconsumption = 7;
        c1.serialnumber = "A1234";
        c1.fuelamount = 30;
        c1.honkamounts=2;

        System.out.println(c1.serialnumber);
        System.out.println(c1.fuelamount);
        c1.drive();
        System.out.println(c1.fuelamount);
        c1.boost();
        c1.honk();
        c1.drive();
        System.out.println(c1.fuelamount);
        float range = c1.getRemainingRange();
        System.out.println("range:" + range +"km");


    }

}
