package at.tim.basics.Calculator;
import java.lang.Math;

public class Sciencecalculator extends Basiccalculator{
    private double result;
    public Sciencecalculator(int nmb1, int nmb2) {
        super(nmb1, nmb2);
    }
    public void sinus(){
        this.result = Math.sin(getNmb1());
        System.out.println("Das Ergebnis ist: " + this.result);
    }
    public void cosinus(){
        this.result = Math.cos(getNmb1());
        System.out.println("Das Ergebnis ist: " + this.result);
    }

}
