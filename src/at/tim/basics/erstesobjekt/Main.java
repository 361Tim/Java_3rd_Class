package at.tim.basics.erstesobjekt;

public class Main {
    public static void main(String[] args) {
        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-10);
        Engine e1 = new Engine(140, Engine.TYPE.Diesel);
        Car c1  = new Car("Audi", 10, "A1234",4, e1, 60);
        Wheels w1 = new Wheels("Contenelli",20);
        c1.addMirror(r1);
        c1.addMirror(r2);

        System.out.println(c1.getMirrors().get(0).getPosition());
    }

}
