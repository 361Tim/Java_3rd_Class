package at.tim.basics.geometricfigures;

public class Circle extends basicfigure {
    private double radius;
    private double area;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public void getArea() {
        this.area = radius * Math.PI;
        System.out.println("The Area of " + getName() + " is " + this.area + "qcm");
    }

}
