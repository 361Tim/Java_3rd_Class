package at.tim.basics.Kamera;

public class Lens {
    private String country;
    private String focallenght;

    public Lens(String country, String focallenght) {
        this.country = country;
        this.focallenght = focallenght;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFocallenght() {
        return focallenght;
    }

    public void setFocallenght(String focallenght) {
        this.focallenght = focallenght;
    }
}
