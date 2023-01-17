import java.time.LocalDateTime;
import java.util.Scanner;

public class FourtySix {

    public static void currentTime() throws Exception {
        System.out.println("## 46. Program returning current system time.");
        System.out.println("Choose formatting\n" +
                "1. YYYY-MM-DDTHH:MM:SS.MMMMMM\n" +
                "2. DAYNAME MMM DD HH MM:SS TIMEZONE");
        Scanner s = new Scanner(System.in);
        int format = s.nextInt();

        if (format == 1) {
            System.out.println(LocalDateTime.now());
        } else if (format == 2) {
            System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
        } else throw new Exception("Wrong value. Try again.");

    }


}
