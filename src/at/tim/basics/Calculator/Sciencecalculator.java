package at.tim.basics.Calculator;

import java.lang.Math;

public class Sciencecalculator extends Basiccalculator {
    private double result;

    public void sinus() {
        this.result = Math.sin(getNmb1());
        System.out.println("Das Ergebnis ist: " + this.result);
    }

    public void cosinus() {
        this.result = Math.cos(getNmb1());
        System.out.println("Das Ergebnis ist: " + this.result);
    }
}
