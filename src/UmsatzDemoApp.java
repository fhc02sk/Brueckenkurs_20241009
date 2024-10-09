public class UmsatzDemoApp {
    public static void main(String[] args) {
        double[] turnovers = new double[] {1000, 1111, 1150, 1300, 1500, 1550}; // ergebnis

        System.out.println("getUmsatzSteigerungGT10(turnovers) = " + getUmsatzSteigerungGT10(turnovers));

        System.out.println("calcAverage(turnovers) = " + calcAverage(turnovers));
    }
    
    public static int getUmsatzSteigerungGT10(double[] turnovers) {

        int counter = 0;

        for (int i = 1; i < turnovers.length; i++) {
            if (turnovers[i] / turnovers[i - 1] > 1.1) {
                counter++;
            }
        }

        return counter; // null
    }

    public static double calcAverage(double[] turnovers) {

        double summe = 0;
        
        for(int i = 0; i < turnovers.length; i++) {
//            summe += turnovers[i];
            summe = summe + turnovers[i];
        }
        System.out.println("summe = " + summe);
        return summe / turnovers.length;
    }

    public static int getMaximumIndex(double[] turnovers) {
        return -1;
    }

    public static double getMaximumValue(double[] turnovers) {

        return 0;
    }
}
