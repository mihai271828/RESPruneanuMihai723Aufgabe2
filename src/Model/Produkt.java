package Model;

public class Produkt implements HasId{
    private Integer id;
    private String Name;
    private int Preis;
    private String Herkunftsregion;

    public Produkt(Integer id,String name, int preis, String herkunftsregion) {
        Name = name;
        Preis = preis;
        Herkunftsregion = herkunftsregion;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPreis() {
        return Preis;
    }

    public void setPreis(int preis) {
        Preis = preis;
    }

    public String getHerkunftsregion() {
        return Herkunftsregion;
    }

    public void setHerkunftsregion(String herkunftsregion) {
        Herkunftsregion = herkunftsregion;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Preis=" + Preis +
                ", Herkunftsregion='" + Herkunftsregion + '\'' +
                '}';
    }
}
