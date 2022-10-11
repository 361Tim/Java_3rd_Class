package at.tim.basics.Cars;

public class Engine {
    public enum TYPE {Diesel, Gas}

    ;
    private TYPE type;
    private int horsepower;

    public Engine(TYPE type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }
}
