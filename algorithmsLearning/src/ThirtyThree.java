import java.lang.reflect.Array;
import java.util.Scanner;

public class ThirtyThree {
    public static void sumDigitsofInt() {
        System.out.println("## Sum digits of given integer program");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide integer number");
        String a = s.nextLine();
        System.out.println("Result: " + sumDigitsofInt(a));
    }

    public static int sumDigitsofInt(String a) {
        int[] digitsArray = new int[a.length()];
        for (int i = 0; i < digitsArray.length; i++) {
            digitsArray[i] = Integer.parseInt(a.substring(i, i + 1));
        }
        int sum = 0;
        for (int i : digitsArray) {
            sum += i;
        }
        return sum;

    }
}
