import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Eleven {
    public static void circle() {
        System.out.println("## Area and perimeter of circle program");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide a radius:");
        int r = s.nextInt();
        System.out.println("Area of circle: " + circleArea(r));
        System.out.println("Perimeter of circle: " + circlePerimeter(r));
    }

     public static double circleArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double circlePerimeter(int radius) {
        return 2 * Math.PI * radius;
    }
}
