package at.tim.basics.Handy;

public class Camera {
    private String type;
    private String name;

    public Camera(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public PhoneFile photo() {
        return new PhoneFile();
    }
}
