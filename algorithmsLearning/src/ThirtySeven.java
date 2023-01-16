import java.util.Locale;
import java.util.Scanner;

public class ThirtySeven {
    public static void countChars() {
        System.out.println("## Count letters, spaces, numbers" +
                " and others of a given string.");
        System.out.println("Type some sentence:");
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        System.out.println(countChars(sentence));
    }

    public static String countChars(String sentence) {
        int lettersCount = 0;
        int spacesCount = 0;
        int numbersCount = 0;
        int othersCount = 0;

        String letters = "qwertyuiopasdfghjklzxcvbnmęóąśłżźćvbń";
        String space = " ";
        String numbers = "1234567890";

        for (int i = 0; i < sentence.length(); i++) {
            String temp = sentence.substring(i, i + 1);
            if (letters.contains(temp) || letters.toUpperCase(Locale.ROOT).contains(temp)) {
                lettersCount += 1;
            } else if (space.contains(temp)) {
                spacesCount += 1;
            } else if (numbers.contains(temp)) {
                numbersCount += 1;
            } else {
                othersCount += 1;
            }
        }
        return "Result: \n" +
                "Letters: " + lettersCount + ", \n" +
                "Spaces: " + spacesCount + ", \n" +
                "Numbers: " + numbersCount + ", \n" +
                "Others:  " + othersCount + ".";

    }
}
