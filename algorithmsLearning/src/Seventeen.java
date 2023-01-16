import java.util.Scanner;

public class Seventeen {

    public static String sumBinary(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);

        int sum = aInt + bInt;

        return Integer.toBinaryString(sum);

    }

    public static void sumBinary() {
        Scanner s = new Scanner(System.in);
        System.out.println("Provide first binary number");
        String a = s.nextLine();
        System.out.println("Provide second binary number");
        String b = s.nextLine();
        System.out.println("Result: " + sumBinary(a, b));
    }

}

