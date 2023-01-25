import java.util.ArrayList;

public class HundredAndTwo {

    public static void is10Or30() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println("Ia 10 or 30 in the array: " + verifyIf10Or30(SeventyFour.generateArray()));

    }


    public static boolean verifyIf10Or30(ArrayList<Integer> arrayList) {
        return (arrayList.contains(10) || arrayList.contains(30));
    }
}
