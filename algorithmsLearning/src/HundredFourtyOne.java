import java.util.ArrayList;
import java.util.Scanner;

public class HundredFourtyOne {


    public static void uniqueChars() {
        System.out.println("## Program to check if given string has unique chars.");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide a string.");
        String string = s.nextLine();
        System.out.println("Result: " + uniqueChars(string));
    }

    public static boolean uniqueChars(String string) {
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            if (chars.contains(string.charAt(i))) {
                return false;
            } else {
                chars.add(string.charAt(i));

            }

        }
        return true;
    }
}

