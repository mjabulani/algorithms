import java.util.ArrayList;
import java.util.Scanner;

public class NinetyFive {

    public static void printArrayofIntegers() {
        System.out.println("## Program prints array of Strings casted from " +
                "array if ints of given value");
        Scanner s = new Scanner(System.in);
        System.out.println("provide number");
        int n = s.nextInt();
        System.out.println(stringArray(n));

    }

    public static ArrayList<String> stringArray(int n) {
        ArrayList<String> strArr = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            strArr.add(String.valueOf(i));
        }
        return strArr;
    }
}
