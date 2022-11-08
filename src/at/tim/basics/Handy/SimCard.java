package at.tim.basics.Handy;

public class SimCard {
    private String telefonnumber;
    private int id;

    public SimCard(String telefonnumber, int id) {
        this.telefonnumber = telefonnumber;
        this.id = id;
    }

    public String getTelefonnumber() {
        return telefonnumber;
    }

    public void setTelefonnumber(String telefonnumber) {
        this.telefonnumber = telefonnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
