import java.util.Scanner;

public class Twelve {
    public static int numbersCount() {
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers?");
        return s.nextInt();

    }

    public static double averageNum() {
        int[] numbers = new int[numbersCount()];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Provide " + (i+1) + " number:");
            numbers[i] = s.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }
        return (sum / (double) numbers.length);

    }

    static void printAvNum() {
        System.out.println("Result: " + averageNum());
    }
}
