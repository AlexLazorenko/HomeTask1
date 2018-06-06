import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortestStringArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list= readListFromKeyboard();
        int minlength = findMinStringLength(list);
        outputShortestString(list, minlength);
    }

    private static ArrayList<String> readListFromKeyboard() throws Exception{
        ArrayList<String> l = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            l.add(str);
        }
        return l;
    }

    private static int findMinStringLength(ArrayList<String> list) {
        int slength = list.get(0).length();
        for (int i = 0; i < 4; i++)
            if (slength > list.get(i + 1).length())
                slength = list.get(i + 1).length();

        return slength;
    }

    private static void outputShortestString(ArrayList<String> list, int minlength ) {
        System.out.println("Shortest string(s):");
        for (int i = 0; i < 5; i++)
            if (minlength == list.get(i).length())
                System.out.println(list.get(i));
    }

}
