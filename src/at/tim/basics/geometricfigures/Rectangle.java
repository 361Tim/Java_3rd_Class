package at.tim.basics.geometricfigures;

public class Rectangle extends basicfigure {
    private double a;
    private double b;
    private double area;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public void getArea() {
        this.area = this.a * this.b;
        System.out.println("The Area of " + getName() + " is " + this.area + "qcm");
    }

}

