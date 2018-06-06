import java.lang.*;
import java.util.Arrays;

public class OddNumbersArray {

    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < 10; i++)
            array[i] = 2*i+1;
        System.out.print(Arrays.toString(array));
    }

}


