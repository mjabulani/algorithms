import java.util.Scanner;

public class TwentySix {
    public static void octalToBinary() {
        System.out.println("## Octal to binary program");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide octal number");
        String octal = s.nextLine();
        System.out.println("Result: " + octalToBinary(octal));


    }

    public static String octalToBinary(String octal) {
        int octalToDec = Integer.parseInt(octal, 8);
        return Integer.toBinaryString(octalToDec);
    }
}
