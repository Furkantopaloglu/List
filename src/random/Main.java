package random;

import java.util.Random;


public class Main {

    public static boolean Control(int array[], int r) {/*control  whether the random number is in the array*/
        for (int i = 0; i < array.length; i++) {
            if (array[i] == r) {
                return false;
            }
        }
        return true;
    }

    public static int[] Bouble_short(int array[]) {/* Sorting the array with bouble short */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {/* for insert to array number */
            Random r = new Random();
            int a = r.nextInt(25);
            while (Control(array, a) == false) {
                a = r.nextInt(25);
            }
            array[i] = a;
        }
        Bouble_short(array);

        for (int j = 0; j < array.length; j++) {/* print array*/
            System.out.print(array[j] + ",");
        }
    }
}
