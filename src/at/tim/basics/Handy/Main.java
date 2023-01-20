package at.tim.basics.Handy;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SimCard simCard1 = new SimCard(1, "06601253");

        MemoryCard sdCard1 = new MemoryCard(16000);
        Camera camera1 = new Camera(1080);

        Phone phone1 = new Phone(simCard1, sdCard1, camera1);
        phone1.setColor("green");
        System.out.println("Color of phone: " + phone1.getColor());
        phone1.makeCall("06601438");
        System.out.println("Free available space: " + phone1.getFreeSpace());
        PhoneFile f1 = new PhoneFile("png", 1.5, "pic1");
        PhoneFile f2 = new PhoneFile("xlsx", 2.1, "table1");
        PhoneFile f3 = new PhoneFile("docx", 3, "doc1");

        phone1.takePicture(1080);
        phone1.takePicture(720);
        phone1.takePicture(480);
        phone1.takePicture(1440);
        sdCard1.saveFile(f1);
        sdCard1.saveFile(f2);
        sdCard1.saveFile(f3);

        System.out.println("-".repeat(40));
        PhoneGUI phoneGUI = new PhoneGUI(phone1);
        phoneGUI.run();
    }
}
