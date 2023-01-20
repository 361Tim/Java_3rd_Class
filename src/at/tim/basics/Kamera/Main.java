package at.tim.basics.Kamera;

public class Main {
    public static void main(String[] args) {

        Producer p1 = new Producer("Germany","Canon");
        Lens l1 = new Lens("Germany","5 meter");
        SdCard s1 = new SdCard(25000);
        Kamera k1 = new Kamera(1,"Black",p1,s1,l1);

    }
}
