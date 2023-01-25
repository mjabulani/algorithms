import java.util.Scanner;

public class SeventyTwo {

    public static void threeChars() {
        System.out.println("## Program prints 3 first chars of string");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(threeChars(str));
    }

    public static String threeChars(String str) {
        String result = "";

        if (str.length() < 3) {
            String hash = "#";
            int missingChars = 3 - str.length();
            result = str + missingChars(str);
        } else {
            result = str.substring(0, 3);
        }
        return result;
    }

    public static String missingChars(String str) {
        StringBuilder missingChars = new StringBuilder();
        for (int i = 0; i < (3 - str.length()); i++) {
            missingChars.append("#");
        }
        return missingChars.toString();
    }

    private static int getMissingChars(int missingChars) {
        return missingChars;
    }
}
