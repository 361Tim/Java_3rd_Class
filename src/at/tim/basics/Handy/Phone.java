package at.tim.basics.Handy;

public class Phone {
    private SimCard simCard;
    private MemoryCard memoryCard;
    private Camera camera;
    private String color;

    public Phone(SimCard simCard, MemoryCard memoryCard, Camera camera) {
        this.simCard = simCard;
        this.memoryCard = memoryCard;
        this.camera = camera;
    }

    public void takePicture(double currentResolution) {
        PhoneFile currentPicture = this.camera.makePicture(currentResolution);
        this.memoryCard.saveFile(currentPicture);
    }

    public void makeCall(String phoneNumber) {
        this.simCard.doCall(phoneNumber);
    }

    public double getFreeSpace() {
        return this.memoryCard.getFreeSpace();
    }

    public void printAllFiles() {
        this.memoryCard.getAllFiles();
    }

    public SimCard getSimCard() {
        return simCard;
    }

    public MemoryCard getMemomrycard() {
        return memoryCard;
    }

    public Camera getCamera() {
        return camera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}