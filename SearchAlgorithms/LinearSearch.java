package SearchAlgorithms;
import java.util.ArrayList;

public class LinearSearch {
    /*
     * Iterative Linear Search
     * 
     * Time Complexity:
     * 
     * Best - O(1)
     * Average - O(N)
     * Worst - O(N))
     * 
     * Space Complexity:
     * 
     * Worst - O(1)
     */
    public static int iterativeLS (ArrayList<Integer> list, int x) {
        int n = list.size();

        for(int i = 0; i < n; i++) {
            if(list.get(i) == x) {
                return i;
            }
        }

        return -1;
    }

    /*
     * Recursive Linear Search
     * 
     * Time Complexity:
     * 
     * Best - O(1)
     * Average - O(N)
     * Worst - O(N))
     * 
     * Space Complexity:
     * 
     * Worst - O(1)
     */
    public static int recursiveLS(ArrayList<Integer> list, int x, int size) {
        if(size == 0) {
            return -1;
        }

        if(list.get(size - 1) == x) {
            return (size - 1);
        }
        else {
            int key = recursiveLS(list, x, size - 1);
            return key;
        }
    }
}
