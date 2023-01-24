package at.tim.basics.Handy;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SimCard simCard1 = new SimCard(1, "0667512313");

        MemoryCard sdCard1 = new MemoryCard(18000);
        Camera camera1 = new Camera(1080);

        Phone phone1 = new Phone(simCard1, sdCard1, camera1);
        phone1.setColor("black");
        System.out.println("Color of phone: " + phone1.getColor());
        phone1.makeCall("06775138");
        System.out.println("Free available space: " + phone1.getFreeSpace());
        PhoneFile f1 = new PhoneFile("jpg", 1, "pic1");
        phone1.takePicture(1080);
        sdCard1.saveFile(f1);


        System.out.println("-".repeat(40));
        PhoneGUI phoneGUI = new PhoneGUI(phone1);
        phoneGUI.run();
    }
}
