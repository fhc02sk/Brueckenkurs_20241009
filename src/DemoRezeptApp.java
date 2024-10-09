public class DemoRezeptApp {

    public static void main(String[] args) {

        Zutat mehl = new Zutat();
        mehl.setName("Mehl");
        mehl.setMenge(300);

        Zutat zucker = new Zutat();
        zucker.setName("Wiener Zucker");
        zucker.setMenge(300);

        Zutat butter = new Zutat();
        butter.setName("Butter BIO");
        butter.setMenge(300);

        Zutat[] zutaten = new Zutat[] {mehl, zucker, butter};

        Rezept butterKeks = new Rezept();
        butterKeks.setName("Süßer Butterkeks");
        butterKeks.setPersonen(4);
        butterKeks.setZutaten(zutaten);

        butterKeks.printRezept();


    }
}
