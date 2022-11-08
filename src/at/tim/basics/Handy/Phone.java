package at.tim.basics.Handy;

public class Phone {
    private Camera cam;
    private SimCard simCard;
    private MemoryCard memoryCard;

    public Phone(Camera cam, SimCard simCard, MemoryCard memoryCard) {
        this.cam = cam;
        this.simCard = simCard;
        this.memoryCard = memoryCard;
    }

    public void takePicture(){
        PhoneFile file = this.cam.photo();
        this.memoryCard.save(PhoneFile);
    }

    public Camera getCam() {
        return cam;
    }

    public void setCam(Camera cam) {
        this.cam = cam;
    }

    public SimCard getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public MemoryCard getMemoryCard() {
        return memoryCard;
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }
}
