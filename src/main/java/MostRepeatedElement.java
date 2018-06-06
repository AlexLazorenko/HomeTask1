import java.util.Arrays;

public class MostRepeatedElement {
    public static void main(String[] args) {
        int[] array = generateArray(13);
        System.out.println("Original array: " + Arrays.toString(array));
        findMostRepeatedElement(array);
    }

    private static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 4 - 2);
        }
        return arr;
    }

    private static void findMostRepeatedElement(int[] arr) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                a++;
            } else if (arr[i] == 1) {
                b++;
            } else {
                c++;
            }
        }

        if (a > b && a > c) {
            System.out.println("\nMost repeated element is -1, count - " + a);
        } else if (b > a && b > c) {
            System.out.println("\nMost repeated element is 1, count - " + b);
        } else if (c > a && c > b) {
            System.out.println("\nMost repeated element is 0, count - " + c);
        } else System.out.println("\nThere is more than one most repeated element");
    }
}







