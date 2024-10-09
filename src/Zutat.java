public class Zutat {
    private String name;
    private int menge;

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMenge() {
        return menge;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(name + " " + menge);
    }
}
