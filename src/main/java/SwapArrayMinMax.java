import java.util.Arrays;

public class SwapArrayMinMax extends ArrayMadness{

    public static void main(String[] args) {
        int[] array = generateData(8);
        System.out.println("Original array: " + Arrays.toString(array));
        array = swapMinMax(array);
        System.out.println("Final array: " + Arrays.toString(array));
    }

    private static int[] swapMinMax(int[] array) {
        int max = 0;
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[max])
                max = i;
            else if (array[i] < array[min])
                min = i;
        }

        int tmp = array[min];
        array[min]=array[max];
        array[max] = tmp;
        return array;
    }

}