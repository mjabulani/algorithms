import java.util.Scanner;

public class HundredFourtyTwo {

    public static void checkAnagram() {
        System.out.println("## Program verifying two strings if they are an anagrams to each other.");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide first string:");
        String str1 = s.nextLine();
        System.out.println("Provide second string:");
        String str2 = s.nextLine();

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 2 reversed: " + reverseString(str2));
        System.out.println("Anagram: " + checkAnagram(str1, reverseString(str2)));


    }

    public static StringBuilder reverseString(String str) {
        StringBuilder str2Reversed = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            str2Reversed.insert(0, ch);
        }
        return str2Reversed;
    }
    public static boolean checkAnagram(String str1, StringBuilder str2Reversed) {

        return (str1.contentEquals(str2Reversed));

    }
}
