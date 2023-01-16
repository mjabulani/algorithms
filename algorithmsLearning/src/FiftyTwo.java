import java.util.Scanner;

public class FiftyTwo {

    public static void checkSum() {
        System.out.println("## Check sum program");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide first integer");
        int a = s.nextInt();
        System.out.println("Provide second integer");
        int b = s.nextInt();
        System.out.println("Provide third integer");
        int c = s.nextInt();
        boolean isTrue = a + b == c;
        System.out.println("First integer: " + a);
        System.out.println("Second integer: " + b);
        System.out.println("Third integer: " + c);
        System.out.println("Is equation valid: " + isTrue);
    }


}
