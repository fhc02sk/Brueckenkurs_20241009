public class Rezept {

    private String name;
    private int personen;

    private Zutat[] zutaten;

    public void setZutaten(Zutat[] zutaten) {
        this.zutaten = zutaten;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonen() {
        return personen;
    }

    public void setPersonen(int personen) {
        this.personen = personen;
    }
}
