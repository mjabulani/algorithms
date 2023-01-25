import java.io.Serializable;
import java.util.Scanner;

public class Seventy {
    public static void shortLongString() {
        System.out.println("## Program concatenating shorter_longer_shorter");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide first string");
        String str1 = s.nextLine();
        System.out.println("Provide second string");
        String str2 = s.nextLine();
        System.out.println(shortLongShort(str1, str2));


    }

    public static Serializable shortLongShort(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str2 + "_" + str1 + "_" + str2;
        } else if (str1.length() < str2.length()) {
            return str1 + "_" + str2 + "_" + str1;
        } else {
            shortLongString();
        }
    return "";
    }
}
