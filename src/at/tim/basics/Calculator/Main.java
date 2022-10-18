package at.tim.basics.Calculator;

public class Main {
    public static void main(String[] args) {
        Rootcalculator r1 = new Rootcalculator(16, 20);
        Sciencecalculator s1 = new Sciencecalculator(3, 7);
        Basiccalculator b1 = new Basiccalculator(4, 6);
        b1.add();
        b1.multiply();
        s1.sinus();
        r1.root();


    }
}
