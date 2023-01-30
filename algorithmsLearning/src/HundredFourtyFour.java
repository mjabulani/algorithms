import java.util.*;

public class HundredFourtyFour {


    public static void main(String[] args) {
        removeOccurance();
    }

    public static void removeOccurance() {
        System.out.println("## Program removing all occurances of given" +
                "string from generated array of Integers.");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide length of array (number of integers)");
        int count = s.nextInt();
        System.out.println("Provide max integer value");
        int maxInt = s.nextInt();
        ArrayList<Integer> array = generateIntArray(count, maxInt);
        System.out.println("Generated array:\n" + array);
        System.out.println(removeOccurances(array));
        System.out.println("Size of new array: " + removeOccurances(array).size());
        System.out.println("Sorted new array: " + sortArrayFromHashSet(removeOccurances(array)));
    }

    public static ArrayList<Integer> generateIntArray(int count, int maxInt) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            arr.add(rand.nextInt(maxInt));
        }
        return arr;
    }

    public static Set<Integer> removeOccurances(ArrayList<Integer> array) {
        Set<Integer> newHashSet = new HashSet<>();
        newHashSet.addAll(array);
        return newHashSet;
    }

    public static ArrayList<Integer> sortArrayFromHashSet(Set<Integer> hashset) {
        ArrayList<Integer> sortedArray = new ArrayList<>(hashset);
        sortedArray.sort(Comparator.naturalOrder());
        return sortedArray;
    }
}
