import java.util.Arrays;

public class Average extends ArrayMadness{

    public static void main(String[] args) {
        int[] array = generateData(10);
        System.out.println("Original array: " + Arrays.toString(array));

        double sum = 0;
        for (int i=0; i < array.length; i++)
            sum = sum + array[i];
        System.out.println("Average of array elements is "+ sum/array.length);
    }

}
