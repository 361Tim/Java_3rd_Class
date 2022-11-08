package at.tim.basics.Handy;

import java.util.ArrayList;
import java.util.List;

public class MemoryCard {
    private double capacity;
    private List<PhoneFile> files;
    public MemoryCard(double capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void save(){
            this.capacity = this.capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public List<PhoneFile> getFiles() {
        return files;
    }

    public void setFiles(List<PhoneFile> files) {
        this.files = files;
    }
}
