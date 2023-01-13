import java.util.Scanner;

public class Three {

    public static int divideTwoNumbs(int a, int b) {
        return a/b;
    }
    public static void divideTwoNumbers() {
        System.out.println("## Divide program");
        Scanner s = new Scanner(System.in);
        System.out.println("First number");
        int a = s.nextInt();
        System.out.println("Secound number");
        int b = s.nextInt();
        System.out.println("Result: " + divideTwoNumbs(a, b));
    }
}
