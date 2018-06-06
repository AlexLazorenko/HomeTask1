import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveRepeatedElements {
    public static void main(String[] args) {
        Set<Integer> numbersSet = readNumbersAndRemoveDuplicates();
        printNumbers(numbersSet);
    }

    public static Set<Integer> readNumbersAndRemoveDuplicates () {
        Set<Integer> numbersSet = new HashSet<>();
        while (numbersSet.size()<=3) {
            System.out.println("Enter more than 3 numbers, separated by comma or space");
            String inputLine = new Scanner(System.in).nextLine();
            Matcher m = Pattern.compile("[0-9]+").matcher(inputLine);
            while (m.find()) {
                numbersSet.add(Integer.valueOf(inputLine.substring(m.start(), m.end())));
            }
        }
        return numbersSet;
    }

    public static void printNumbers (Set<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + ",");
        }
    }

}
