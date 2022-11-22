package at.tim.basics.Kamera;

public class Kamera {
    private double weight;
    private String color;
    public  enum QUALITY{High, Medium, Low};
    private Producer producer;
    private SdCard sdCard;
    private Lens lens;

    public Kamera(double weight, String color, Producer producer, SdCard sdCard, Lens lens) {
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.sdCard = sdCard;
        this.lens = lens;
    }

    public void takepicture(){

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public SdCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SdCard sdCard) {
        this.sdCard = sdCard;
    }
}
