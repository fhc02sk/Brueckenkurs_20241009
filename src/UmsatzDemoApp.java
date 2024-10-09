public class UmsatzDemoApp {
    public static void main(String[] args) {
        double[] turnovers = new double[] {1000, 1111, 1150, 1300, 1500, 1550, 800, 2000}; // ergebnis

        System.out.println("getUmsatzSteigerungGT10(turnovers) = " + getUmsatzSteigerungGT10(turnovers));

        System.out.println("calcAverage(turnovers) = " + calcAverage(turnovers));

        System.out.println("getMaximumIndex(turnovers) = " + getMaximumIndex(turnovers));

        System.out.println("getMaximumValue(turnovers) = " + getMaximumValue(turnovers));
        System.out.println("getMaximumValue2(turnovers) = " + getMaximumValue2(turnovers));
        System.out.println("getMaximumValue3(turnovers) = " + getMaximumValue3(turnovers));
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
        //1000, 1111, 1150, 1300, 1500, 1550, 800, 2000
        int indexMaxValue = 0;

        for (int i = 0; i < turnovers.length; i++) {
            if (turnovers[i] > turnovers[indexMaxValue]) {
                indexMaxValue = i;
            }
        }

        return indexMaxValue;
    }
    public static double getMaximumValue3(double[] turnovers) {
        int indexOfMaxValue = getMaximumIndex(turnovers);
        return turnovers[indexOfMaxValue];
    }

    public static double getMaximumValue(double[] turnovers) {
        //1000, 1111, 1150, 1300, 1500, 1550, 800, 2000
        int indexMaxValue = 0;

        for (int i = 0; i < turnovers.length; i++) {
            if (turnovers[i] > turnovers[indexMaxValue]) {
                indexMaxValue = i;
            }
        }

        return turnovers[indexMaxValue];
    }

    public static double getMaximumValue2(double[] turnovers) {
        //1000, 1111, 1150, 1300, 1500, 1550, 800, 2000
        //double maxValue = turnovers[0];
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < turnovers.length; i++) {
            if (turnovers[i] > maxValue) {
                maxValue = turnovers[i] ;
            }
        }

        return maxValue;
    }
}
