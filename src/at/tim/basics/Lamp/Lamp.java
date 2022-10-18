package at.tim.basics.Lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private int glowingelemnts;
    private List<LightElement> lightElements;


    public Lamp(int glowingelemnts, String name, String color, int powerconsumption) {
        this.glowingelemnts = glowingelemnts;
        this.lightElements = new ArrayList<>();
    }

    public void addLightElement(LightElement lightElement) {
        this.lightElements.add(lightElement);
    }

    public List<LightElement> getLightElements() {
        return lightElements;
    }


    public int getGlowingelemnts() {
        return glowingelemnts;
    }

    public void setGlowingelemnts(int glowingelemnts) {
        this.glowingelemnts = glowingelemnts;
    }


}
