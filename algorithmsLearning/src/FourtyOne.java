import java.util.Scanner;

public class FourtyOne {

    public static void asciiForChar() {
        System.out.println("## Program returns ASCII code value for given char.");
        System.out.println("Provide valid char:");
        Scanner s = new Scanner(System.in);

        char c = s.next().charAt(0);
        System.out.println("ASCII value for char: \"" + c + "\" is: " + (int) c);
    }

}
