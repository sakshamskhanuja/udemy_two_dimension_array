import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialization of a 2D Array having 4 rows and columns.
        int[][] array2 = new int[4][4];

        // Prints the length of array2.
        System.out.println("Length = " + array2.length);

        // Printing elements of array2.
        for (int[] array : array2) {
            System.out.println(Arrays.toString(array));
        }

        // Divider
        System.out.println("-".repeat(20));

        // Printing elements of array2 without using Arrays.toString().
        for (int i = 0; i < array2.length; i++) {
            // Accesses inner array.
            int[] innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        // Divider
        System.out.println("-".repeat(20));

        // Printing elements of array2 via enhanced for loop.
        for (int[] inner: array2) {
            for (int element : inner) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Divider
        System.out.println("-".repeat(20));

        // Using deepToString method of Arrays to print multi-dimension array.
        System.out.println(Arrays.deepToString(array2));

        // Filling up a 2D Array.
        Random random = new Random();
        for (int i = 0; i < array2.length; i++) {
            int[] array = array2[i];
            for (int j = 0; j < array.length; j++) {
                array2[i][j] = random.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(array2));
    }
}