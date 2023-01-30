import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class HoundredAndThirtyEight {
    
    public static void longestString() {
        Scanner s = new Scanner(System.in);
        System.out.println("How many strings to be added?");
        int stringsCount = s.nextInt();
        System.out.println(longestString(generateDictionary(stringsCount)));


    }

    public static ArrayList<String> generateDictionary(int count) {
        Scanner a = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            System.out.println("Provide " + i+1 + " string.");
            String word = a.nextLine();
            strings.add(word);
        }
        return strings;
    }

    public static String longestString(ArrayList<String> strings) {
        String max = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > max.length()) {
                max = strings.get(i);
            }
        }
        return max;
    }
}

