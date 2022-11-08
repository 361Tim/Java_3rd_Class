package at.tim.basics.Handy;

public class Main {
    public static void main(String[] args) {
        Camera c1 = new Camera("12 Megapixel", "Camera1");
        MemoryCard m1 = new MemoryCard(256000);
        SimCard s1 = new SimCard("+43 677 64456723",1);
        Phone p1 = new Phone(c1,s1,m1);
        p1.takePicture();

    }
}
