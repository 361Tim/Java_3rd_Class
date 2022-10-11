package at.tim.basics.Cars;

public class Producer {
    private String name;
    private String country;
    private double discount;

    public Producer(String name, String country, double discount) {
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
