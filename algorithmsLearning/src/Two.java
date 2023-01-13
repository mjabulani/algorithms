import java.util.Scanner;

public class Two {

    public static int sumTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void sumTwoNumbers() {
        System.out.println("### Sum program");
        Scanner s = new Scanner(System.in);
        System.out.println("First number");
        int a = s.nextInt();
        System.out.println("Second number");
        int b = s.nextInt();
        System.out.println("Result: " + sumTwoNumbers(a, b));
    }
}
