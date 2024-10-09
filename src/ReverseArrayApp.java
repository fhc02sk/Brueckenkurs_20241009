import java.util.Arrays;

public class ReverseArrayApp {

    public static void main(String[] args) {

        String[] array = new String[] {"Hallo", "Max", "Mustermann", "wohnt"};
        System.out.println("array = " + Arrays.toString(array));

        String[] result = reverseArray2(array);

        System.out.println("result = " + Arrays.toString(result));
    }

    public static String[] reverseArray2(String[] arrayToReverse) {

        for(int i = 0; i < arrayToReverse.length / 2; i++) {
            // 0 => 3 (4 - 0 (i) - 1)
            // 1 => 2 (4 - 1 (i) - 1)
            String temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[arrayToReverse.length - i - 1];
            arrayToReverse[arrayToReverse.length - i - 1] = temp;
        }

        return arrayToReverse;
    }

    public static String[] reverseArray(String[] arrayToReverse) {

        String[] result = new String[arrayToReverse.length];

        for(int i = 0; i < arrayToReverse.length;i++) {
            // 0 => 3 (4 - 0 (i) - 1)
            // 1 => 2 (4 - 1 (i) - 1)
            // 2 => 1 (4 - 2 (i) - 1)
            // 3 => 0 (4 - 3 (i) - 1)
            result[i] = arrayToReverse[arrayToReverse.length - i - 1];
        }

        return result;
    }


}
