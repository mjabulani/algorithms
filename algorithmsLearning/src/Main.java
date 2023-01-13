import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static void runProgram() {
        System.out.println("Chose the program you want to run\n" +
                "Type 0 to view list of available programs");
        Scanner s = new Scanner(System.in);
        int program = s.nextInt();

    }

    public static void runProgram(int program) throws Exception {
        //                ListOfAlgorithms.list();
        switch (program) {
            case 0 -> ListOfAlgorithms.list();
            case 1 -> One.printName();
            default -> throw new Exception("Wrong choice");
        }
    }

}
