import java.util.ArrayList;

public class EightyTwo {

    public static void highestIntfromArray() {
        System.out.println("## Get highest from the first, middle, last elements of array ");
        ArrayList<Integer> array = SeventyFour.generateArray();
        System.out.println("Array: " + array);
        System.out.println("Highest: " + getHighest(array));
    }

    public static int getHighest(ArrayList<Integer> array) {
        ArrayList<Integer> arrayOf3 = new ArrayList<Integer>();
        arrayOf3.add(array.get(0));
        arrayOf3.add(array.get((array.size()-1)/2));
        arrayOf3.add(array.get(array.size()-1));
        int highest = 0;

        for (Integer integer : arrayOf3) {
            if (integer > highest) {
                highest = integer;
            }
        }
        return highest;
    }

}
