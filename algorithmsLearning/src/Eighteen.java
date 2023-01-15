import java.util.Scanner;

public class Eighteen {

    public static void multiplyBinary() {
        System.out.println("## Multiply binary program");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide 1st binary");
        String a = s.nextLine();
        System.out.println("Provide 1st binary");
        String b = s.nextLine();
        System.out.println("Result: " + multiplyBinary(a, b));
    }

    public static String multiplyBinary(String a, String b) {

        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);

        return Integer.toBinaryString(aInt * bInt);
    }
}
