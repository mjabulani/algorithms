import java.util.Scanner;

public class EightyFour {

    public static void frontAndBack() {
        System.out.println("## Program to take the last three characters from" +
                " a given string and add the three characters at both " +
                "the front and back of the string");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        System.out.println(frontAndBack(string));
    }

    public static String frontAndBack(String string) {

        String substring = string.substring(string.length() - 3);
        return substring + string + substring;
    }
}
