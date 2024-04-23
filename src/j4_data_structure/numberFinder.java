import java.util.Hashtable;

public class NumberFinder {

    public static void main(String[] args) {
        int[] array = {2, 5, 7, 9, 13, 17, 22, 25};
        int target = 13;

        int foundIndex = findNumber(array, target);

        if (foundIndex != -1) {
            System.out.println("Number " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }

    public static int findNumber(int[] array, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        // Populate the hashtable with array elements and their indices
        for (int i = 0; i < array.length; i++) {
            hashtable.put(array[i], i);
        }

        // Check if the target number exists in the hashtable
        if (hashtable.containsKey(target)) {
            return hashtable.get(target);
        } else {
            return -1; // Not found
        }
    }
}
