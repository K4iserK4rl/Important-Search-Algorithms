package SearchAlgorithms;
import java.util.ArrayList;

public class BinarySearch {
    /*
     * Iterative Binary Search
     * 
     * Time Complexity:
     * 
     * O(log(N))
     * 
     * Space Complexity:
     * 
     * O(1)
     */
    public static int iterativeBS(ArrayList<Integer> list, int x, int low, int high) {
        while(high - low > 1) {
            int mid = (low + high) / 2;

            if(list.get(mid) == x) {
                return mid;
            }
            else if(list.get(mid) < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if(list.get(low) == x) {
            return low;
        }
        else if(list.get(high) == x) {
            return high;
        }
        else {
            return -1;
        }
    }

    /*
     * Recursive Binary Search
     * 
     * Time Complexity:
     * 
     * O(log(N))
     * 
     * Space Complexity:
     * 
     * O(log(N))
     */
    public static int recursiveBS(ArrayList<Integer> list, int x, int low, int high) {
        if(high >= low) {
            int mid = low + (high - 1) / 2;

            if(list.get(mid) == x) {
                return mid;
            }

            if(list.get(mid) > x) {
                return recursiveBS(list, x, low, mid - 1);
            }

            return recursiveBS(list, x, mid + 1, high);
        }

        return -1;
    }
}
