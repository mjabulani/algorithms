import java.util.HexFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        runProgram();


    }

    public static void runProgram() throws Exception {
        System.out.println("\nChose the program you want to run\n" +
                "Type 0 to view list of available programs\n");
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
            case 17 -> Seventeen.sumBinary();
            case 18 -> Eighteen.multiplyBinary();
            case 26 -> TwentySix.octalToBinary();
            case 33 -> ThirtyThree.sumDigitsofInt();
            case 37 -> ThirtySeven.countChars();
            case 41 -> FourtyOne.asciiForChar();
            case 46 -> FourtySix.currentTime();
            case 50 -> Fifty.divide35both();
            case 52 -> FiftyTwo.checkSum();
            case 57 -> FiftySeven.countFactors();
            default -> throw new Exception("Wrong choice");
        }
    }
}
