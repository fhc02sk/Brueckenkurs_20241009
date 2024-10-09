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

    public void printRezept() {
        System.out.println("Name: " + name);
        System.out.println("Rezept passt für " + personen + " Personen");

        for (int i = 0; i < zutaten.length; i++) {
            zutaten[i].print();
        }
        System.out.println("-----------------------------");
    }

    public Rezept umrechnen(int zielPersonen) {
        Rezept neu = new Rezept();
        neu.setName(name);
        neu.setPersonen(zielPersonen);

        double faktor = zielPersonen / (personen * 1.0);
        Zutat[] arr = new Zutat[zutaten.length];

        for (int i = 0; i < zutaten.length; i++) {
            arr[i] = new Zutat();
            arr[i].setName(zutaten[i].getName());
            arr[i].setMenge((int) (zutaten[i].getMenge() * faktor));
        }
        neu.setZutaten(arr);
        return neu;
    }
}
