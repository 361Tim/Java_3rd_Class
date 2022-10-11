package at.tim.basics.Lamp;

public class Lamp {
    private int glowingelemnts;
    private String name;
    private String color;
    private int powerconsumption;
    private String status;
    private boolean elementstatus;

    public Lamp(int glowingelemnts, String name, String color, int powerconsumption) {
        this.glowingelemnts = glowingelemnts;
        this.name = name;
        this.color = color;
        this.powerconsumption = powerconsumption;
    }

    public void turnOn() {
        if (status == "On") {
            System.out.println("Ist bereits eingeschaltet");
            this.powerconsumption = +5;
        } else {
            this.powerconsumption = +5;
            System.out.println("Ist jetzt eingeschalten");
        }
    }

    public void addLightElement() {
        if (this.elementstatus != true) {
            this.powerconsumption = +5;
            System.out.println("Ein neues Element engeschalten");
        } else System.out.println("Alle Elemente bereits eingeschalten");
    }

    public void turnAllOn() {
        if (this.elementstatus != true) {
            System.out.println("Alle Elemente eingeschaltet");
            this.powerconsumption = this.powerconsumption + this.glowingelemnts * 5;
        }
        this.elementstatus = true;
    }

    public void getOverallPoweUseage() {
        System.out.println(this.powerconsumption);
    }

    public int getGlowingelemnts() {
        return glowingelemnts;
    }

    public void setGlowingelemnts(int glowingelemnts) {
        this.glowingelemnts = glowingelemnts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPowerconsumption() {
        return powerconsumption;
    }

    public void setPowerconsumption(int powerconsumption) {
        this.powerconsumption = powerconsumption;
    }
}
