package at.tim.basics.erstesobjekt;

public class Wheels {
    private String tirebrand;
    private int tiresize;

    public Wheels(String tirebrand, int tiresize) {
        this.tirebrand = tirebrand;
        this.tiresize = tiresize;
    }

    public String getTirebrand() {
        return tirebrand;
    }

    public void setTirebrand(String tirebrand) {
        this.tirebrand = tirebrand;
    }

    public int getTiresize() {
        return tiresize;
    }

    public void setTiresize(int tiresize) {
        this.tiresize = tiresize;
    }
}
