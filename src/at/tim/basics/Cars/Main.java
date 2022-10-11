package at.tim.basics.Cars;

public class Main {
    public static void main(String[] args) {
        Producer p1 = new Producer("Nissan", "Japan", 5);
        Engine e1 = new Engine(Engine.TYPE.Diesel, 200);
        Car c1 = new Car("White", 300, 10000, 60000, 20, e1, p1);

        c1.newprice();
        System.out.println(c1.getNewprice());
        c1.fuelconsumption();
        System.out.println(c1.getNewfuelconsumption());
    }
}
