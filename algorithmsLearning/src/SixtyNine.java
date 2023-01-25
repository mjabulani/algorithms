import java.util.Scanner;

public class SixtyNine {
    public static void subsHalf() throws Exception {
        System.out.println("## Print substring of even length String");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide even lengthened String");
        String str = s.nextLine();
        System.out.println(subsHalf(str));
    }

    public static String subsHalf(String str) throws Exception {
        if (str.length() % 2 == 0) {
            String halfString = str.substring(0, str.length()/2);
            return halfString;
        } else {
            System.out.println("number is odd");
            throw new Exception("Odd number instead of even.");
        }
    }
}
