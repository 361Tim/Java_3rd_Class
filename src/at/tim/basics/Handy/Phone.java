package at.tim.basics.Handy;

public class Phone {
    private Camera cam;
    private SimCard simCard;
    private MemoryCard memoryCard;

    public void takePicture(){
        PhoneFile file = this.cam.photo();
        this.memoryCard.save(file);
    }
}
