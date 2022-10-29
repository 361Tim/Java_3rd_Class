package at.tim.basics.geometricfigures;

public class basicfigure {
    private String name;

    public basicfigure(String name) {
        this.name = name;
    }

    public void Name(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
