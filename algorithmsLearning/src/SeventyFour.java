import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SeventyFour {

    public static void isGivenIntInArray() {
        System.out.println("## Program checks if given int number is in secret array");
        Scanner s = new Scanner(System.in);
        // Secret array;
        ArrayList<Integer> array = generateArray();
        System.out.println("Provide valid int");
        int number = s.nextInt();
        System.out.println("Secret array" + array);
        System.out.println("Array contains " + number + ": " + isGivenIntInArray(number, array));
    }

    public static boolean isGivenIntInArray(int number, ArrayList<Integer> array) {
        return array.contains(number);
    }

    public static ArrayList<Integer> generateArray() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random ran = new Random();
        int temp = 0;
        while (array.size() < 10) {
            temp = ran.nextInt(0, 25);
            if (!array.contains(temp)) {
                array.add(temp);
            }
        }
        return array;
    }
}

