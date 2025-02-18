package Model;

import java.util.List;

public class Charakter implements HasId{
    private Integer ID;
    private String Name;
    private String Herkunftsdorf;
    private List<Produkt> Gekaufteprod;

    public Charakter(Integer ID, String name, String herkunftsdorf, List<Produkt> gekaufteprod) {
        this.ID = ID;
        Name = name;
        Herkunftsdorf = herkunftsdorf;
        Gekaufteprod = gekaufteprod;
    }

    public Integer getId() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHerkunftsdorf() {
        return Herkunftsdorf;
    }

    public void setHerkunftsdorf(String herkunftsdorf) {
        Herkunftsdorf = herkunftsdorf;
    }

    public List<Produkt> getGekaufteprod() {
        return Gekaufteprod;
    }

    public void setGekaufteprod(List<Produkt> gekaufteprod) {
        Gekaufteprod = gekaufteprod;
    }
    public void add(Produkt produkt) {
        Gekaufteprod.add(produkt);
    }
    public void remove(Produkt produkt) {
        Gekaufteprod.remove(produkt);
    }

    @Override
    public String toString() {
        return "Charakter{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Herkunftsdorf='" + Herkunftsdorf + '\'' +
                ", Gekaufteprod=" + Gekaufteprod +
                '}';
    }
}
