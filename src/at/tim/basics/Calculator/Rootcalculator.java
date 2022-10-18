package at.tim.basics.Calculator;

import java.lang.Math;

public class Rootcalculator extends Basiccalculator {
    private double result;

    public Rootcalculator(double nmb1, double nmb2) {
        super(nmb1, nmb2);
    }

    public void root() {
        this.result = Math.sqrt(getNmb1());
        System.out.println("Das Ergebnis ist: " + this.result);
    }
}
