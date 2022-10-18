package at.tim.basics.Lamp;

public class Main {
    public static void main(String[] args) {

        LightElement L1 = new LightElement("Element 1", 10, "Rot");
        Lamp l1 = new Lamp(1, "Element 1", "Green", 10);
        l1.addLightElement(L1);
        L1.getOverallPowerConsumption();
        System.out.println(L1.getTotalpowerconsumption());
        L1.turnOn();
        System.out.println(L1.getStatus());
        L1.turnOn();
        System.out.println(L1.getStatus());
        L1.getOverallPowerConsumption();
        System.out.println(L1.getTotalpowerconsumption());
    }
}
