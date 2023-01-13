import java.util.Scanner;

public class Five {
    public static int multiple(int a, int b) {
        return a*b;
    }

    public static void multiple() {
        System.out.println("## 5. Multiple program");
        Scanner s = new Scanner(System.in);
        System.out.println("First number");
        int a = s.nextInt();
        System.out.println("Second number");
        int b = s.nextInt();
        System.out.println("Result: "+ multiple(a,b));

    }
}
