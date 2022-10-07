package at.tim.basics.erstesobjekt;

public class Engine {
    private int horsepower;

    public enum TYPE {Diesel, GAS}

    private TYPE type;

    public Engine(int horsepower, TYPE type) {
        this.horsepower = horsepower;
        this.type = type;


    }

    public void drive(int amount) {
        System.out.println("the motor is running with amount" + horsepower + "ps");
    }



    public int getHorsepower(int i) {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }
}
