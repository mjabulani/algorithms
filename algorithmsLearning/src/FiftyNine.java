import java.util.Locale;
import java.util.Scanner;

public class FiftyNine {
    public static void toLower() {
        System.out.println("## Sentence to lower case ");
        Scanner s = new Scanner(System.in);
        System.out.println("Type a sentence:");
        String sentence = s.nextLine();
        System.out.println("Lower case: \"" + toLower(sentence)+ "\"");
    }

    public static String toLower (String sentence) {
        return sentence.toLowerCase(Locale.ROOT);
    }
}
