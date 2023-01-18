import java.util.Scanner;

public class FourtyNine {
    public static void isOdd() {
        System.out.println("## Is given number odd?\n1 - yes, 0 - no");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide number");
        int number = s.nextInt();

        String isOdd = (number % 2 == 0) ? "1" : "0";
        System.out.println(isOdd);
    }
}

