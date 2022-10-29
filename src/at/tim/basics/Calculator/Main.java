package at.tim.basics.Calculator;

public class Main {
    public static void main(String[] args) {
        Rootcalculator r1 = new Rootcalculator();
        Sciencecalculator s1 = new Sciencecalculator();
        Basiccalculator b1 = new Basiccalculator();
        b1.setNmb1(12);
        b1.setNmb2(12);
        b1.add();
        b1.setNmb1(10);
        b1.setNmb2(10);
        b1.multiply();
        s1.sinus();
        r1.setNmb1(100);
        r1.root();
    }
}
