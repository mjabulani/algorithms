import java.util.Scanner;

public class Sixty {
    public static void reverseString() {
        System.out.println("## Reverse given string.");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide a string");
        String wordToReverse = s.nextLine();
        System.out.println(reverseString(wordToReverse));;

    }

    public static String reverseString(String wordToReverse) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = 0; i < wordToReverse.length(); i++) {
            char ch = wordToReverse.charAt(i);
            reversedString.insert(0, ch);
        }

        return reversedString.toString();
    }
}
