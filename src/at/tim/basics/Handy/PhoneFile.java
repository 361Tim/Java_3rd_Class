package at.tim.basics.Handy;

public class PhoneFile {
    private String name;
    private String type;
    private int id;
    private double size;



    public PhoneFile(String name, String type, int id, double size) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
