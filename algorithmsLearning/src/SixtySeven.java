import java.util.Scanner;

public class SixtySeven {

    public static void insertInTheMiddle() {
        System.out.println("## Program puts given string in the middle of another");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide the first string");
        String str1 = s.nextLine();
        System.out.println("Provide the second string");
        String str2 = s.nextLine();
        System.out.println("New nested string in string: \n" +
                insertInTheMiddle(str1, str2));
    }

    public static String insertInTheMiddle(String str1, String str2) {
        return str1.substring(0, str1.length()/2) + str2 + str1.substring(str1.length()/2, str1.length());
    }
}
