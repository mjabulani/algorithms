import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fifty {

    public static void divide35both() {
        System.out.println("## Program lists whether given number is diviable by 3, 5 or both");
        System.out.println("Provide number");
        Scanner s = new Scanner(System.in);
        int numb = s.nextInt();
        List<Integer> by3 = new ArrayList<>();
        List<Integer> by5 = new ArrayList<>();
        List<Integer> by3And5 = new ArrayList<>();
        for (int i = 3; i <= numb; i++) {
            if (i % 3 == 0) {
                by3.add(i);
            }
            if (i % 5 == 0) {
                by5.add(i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                by3And5.add(i);
            }
        }
        System.out.println("By 3 (" + by3.size() + " elements): " + by3 + "\n" +
                "By 5 (" + by5.size() + " elements): " + by5 + "\n" +
                "By 3 and by 5 (" + by3And5.size() + " elements): " +by3And5);

    }
}
