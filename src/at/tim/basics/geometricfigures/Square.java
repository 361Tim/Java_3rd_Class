package at.tim.basics.geometricfigures;

public class Square extends basicfigure{
    private double a;
    private double area;
    public Square(String name, double a) {
        super(name);
        this.a = a;
    }
    public void getArea(){
        this.area = a * a;
        System.out.println("The Area of " + getName() + " is " + this.area + "qcm");
    }

}
