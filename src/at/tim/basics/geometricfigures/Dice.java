package at.tim.basics.geometricfigures;

public class Dice extends basicfigure {
    private double a;
    private double area;

    public Dice(String name, double a) {
        super(name);
        this.a = a;
    }

    public void getArea() {
        this.area = 6 * this.a * this.a;
        System.out.println("The Area of " + getName() + " is " + this.area + "qcm");
    }


}

