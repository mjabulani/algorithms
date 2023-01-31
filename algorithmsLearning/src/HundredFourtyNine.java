import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class HundredFourtyNine {

    public static void isPermutation() {
        System.out.println("## Program checking if String2 is permutation of String1");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide 1st String");
        String str1 = s.nextLine();
        System.out.println("Provide second string");
        String str2 = s.nextLine();
        System.out.println("Is permutation: " + isPermutation(str1, str2));;
    }

    public static boolean isPermutation(String str1, String str2) {
        ArrayList<Character> str1Array = new ArrayList<>();
        ArrayList<Character> str2Array = new ArrayList<>();
        if (str1.length() != str2.length()) {
            return false;
        }

        // Generating Char array for 1st string, lowering case
        String str1Lower = str1.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str1Lower.length(); i++) {
            str1Array.add(str1Lower.charAt(i));
        }

        // Generating Char array for 2nd string, lowering case
        String str2Lower = str1.toLowerCase(Locale.ROOT);
        for (int j = 0; j < str2Lower.length(); j++) {
            str2Array.add(str2Lower.charAt(j));
        }

        for (int k = 0; k < str2Array.size(); k++) {
            str1Array.remove(str2Array.get(k));

            }
        return str1Array.size() == 0;
    }
}
