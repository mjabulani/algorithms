import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        runProgram();
    }

    public static void runProgram() throws Exception {
        System.out.println("Chose the program you want to run\n" +
                "Type 0 to view list of available programs");
        Scanner s = new Scanner(System.in);
        int program = s.nextInt();
        runProgram(program);
    }

    public static void runProgram(int program) throws Exception {
        switch (program) {
            case 0 -> {
                ListOfAlgorithms.list();
                runProgram();
            }
            case 1 -> One.printName();
            case 2 -> Two.sumTwoNumbers();
            case 3 -> Three.divideTwoNumbers();
            case 4 -> Five.multiple();
            case 7 -> Seven.multiBy10();
            case 11 -> Eleven.circle();
            case 12 -> Twelve.printAvNum();
            case 15 -> Fifteen.swapVariables();
            default -> throw new Exception("Wrong choice");
        }
    }
}
