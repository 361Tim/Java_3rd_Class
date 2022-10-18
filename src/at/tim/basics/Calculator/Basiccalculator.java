package at.tim.basics.Calculator;

public class Basiccalculator {
    private double nmb1;
    private double nmb2;
    private double result;

    public Basiccalculator(double nmb1, double nmb2) {
        this.nmb1 = nmb1;
        this.nmb2 = nmb2;
    }

    public void add() {
        this.result = this.nmb1 + this.nmb2;
        System.out.println("Das Ergebnis ist: " + this.result);
    }

    public void subtract() {
        this.result = this.nmb1 - this.nmb2;
        System.out.println("Das Ergebnis ist: " + this.result);
    }

    public void divide() {
        this.result = this.nmb1 / this.nmb2;
        System.out.println("Das Ergebnis ist: " + this.result);
    }

    public void multiply() {
        this.result = this.nmb1 * this.nmb2;
        System.out.println("Das Ergebnis ist: " + this.result);
    }

    public double getNmb1() {
        return nmb1;
    }

    public void setNmb1(int nmb1) {
        this.nmb1 = nmb1;
    }

    public double getNmb2() {
        return nmb2;
    }

    public void setNmb2(int nmb2) {
        this.nmb2 = nmb2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
