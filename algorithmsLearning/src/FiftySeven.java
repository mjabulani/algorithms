import java.util.ArrayList;
import java.util.Scanner;

public class FiftySeven {

    public static int countFactors(int number) {
        int factorCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }
        return factorCount;
    }

    public static ArrayList<Integer> factors(int number) {
        ArrayList<Integer> factor = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factor.add(i);
            }
        }
        return factor;
    }

    public static void countFactors() {
        System.out.println("Program counts factors of given integer.");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide integer number");
        int number = s.nextInt();
        System.out.println("There are " + countFactors(number) + " factors for " + number + ".\n" +
                "List of factors: " + factors(number));

    }
}
