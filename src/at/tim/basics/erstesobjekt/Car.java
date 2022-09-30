package at.tim.basics.erstesobjekt;

public class Car {
    // Instanz / Gedächtnisvariablen
    public float fuelconsumption;
    public String brand;
    public int honkamounts;
    public int fuelamount;
    public int tank;
    public String serialnumber;
    private String color;

    public void drive() {
        this.fuelamount -= this.fuelconsumption;
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

        float range = this.fuelamount / this.fuelconsumption *100;
       return   range;
    }

}
