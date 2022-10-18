package at.tim.basics.Lamp;

public class LightElement {
    private String name;
    private int powerconsumption;
    private int totalpowerconsumption;
    private String color;
    private String status;

    public LightElement(String name, int powerconsumption, String color) {
        this.name = name;
        this.powerconsumption = powerconsumption;
        this.color = color;
    }

    public void turnOn() {
        if (this.status != "on") {
            this.status = "on";
            this.totalpowerconsumption = +this.powerconsumption;
        } else if (this.status == "on") {
            System.out.println("Mein Name ist " + this.name + " und ich bin bereits eingeschalten");
            this.totalpowerconsumption = +5;
        }
    }

    public void turnAllOn() {
        this.status = "on";
        this.totalpowerconsumption = +this.powerconsumption;
    }

    public void getOverallPowerConsumption() {
        System.out.println("Bisher verbrauchter Strom beträgt " + this.totalpowerconsumption);
    }

    public void printNamesOfLightElements() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerconsumption() {
        return powerconsumption;
    }

    public void setPowerconsumption(int powerconsumption) {
        this.powerconsumption = powerconsumption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTotalpowerconsumption() {
        return totalpowerconsumption;
    }

    public void setTotalpowerconsumption(int totalpowerconsumption) {
        this.totalpowerconsumption = totalpowerconsumption;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
