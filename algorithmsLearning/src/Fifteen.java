import java.util.Scanner;

public class Fifteen {



    public static void swapVariables() {
        int temp = 0;
        System.out.println("## Swap variables program");
        Scanner s = new Scanner(System.in);
        System.out.println("1st var");
        int a = s.nextInt();
        System.out.println("2nd var");
        int b = s.nextInt();
        System.out.println("Before swap\n" +
                "A = " + a + ", B = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap\n" +
                "A = " + a + ", B = " + b);
    }
}
