import java.util.Scanner;


// Program for multiplication given number (1-10).
public class Seven {
    public static void multiBy10() {
        System.out.println("## Multi by 1-10 program");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide a number (int):");
        int number = s.nextInt();
        multiBy10(number);

    }

    public static void multiBy10(int number) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(number + " X " + i + " = " + number*i);
        }
    }
}
