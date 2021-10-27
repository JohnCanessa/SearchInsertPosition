import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * LeetCode 35 Search Insert Position
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {


    /**
     * Return the index if the target is found. 
     * If not, return the index where it would 
     * be if it were inserted in order.
     * 
     * Using binary search to locate index.
     * 
     * 64 / 64 test cases passed.
     * Status: Accepted
     * Runtime: 0 ms
     * Memory Usage: 38.8 MB
     * 
     * Execution: O(n log(n)) - Space: O(1)
     */
    static public int searchInsert0(int[] nums, int target) {
        
        // **** sanity check(s) ****
        if (nums.length == 1 && nums[0] == target) return 0;
        if (target < nums[0]) return 0;
        if (nums[nums.length - 1] < target) return nums.length;

        // **** initialization ****
        int l = 0;
        int r = nums.length - 1;

        // **** search for the location in the array ****
        while (l <= r) {

            // **** compute mid point ****
            int m = l + (r - l) / 2;

            // ???? ????
            System.out.println("<<< nums[" + m + "]: " + nums[m]);

            // **** check if target was found ****
            if (nums[m] == target) return m;

            // **** decide which way to continue the search ****
            if (nums[m] > target)
                r = m - 1;          // go left
            else 
                l = m + 1;          // go right
        }

        // ???? ????
        System.out.println("<<< l: " + l + " r: " + r);

        // **** return index to insert target ****
        return l;
    }


    /**
     * Return the index if the target is found. 
     * If not, return the index where it would 
     * be if it were inserted in order.
     * 
     * Using binary search to locate index.
     * 
     * 64 / 64 test cases passed.
     * Status: Accepted
     * Runtime: 0 ms
     * Memory Usage: 38.8 MB   
     */
    static public int searchInsert(int[] nums, int target) {

        // **** initialization ****
        int l = 0;
        int r = nums.length - 1;

        // **** search for the location in the array ****
        while (l <= r) {

            // **** compute mid point ****
            int m = l + (r - l) / 2;

            // ???? ????
            System.out.println("<<< nums[" + m + "]: " + nums[m]);

            // **** check if target was found ****
            if (nums[m] == target) return m;

            // **** decide which way to continue the search ****
            if (nums[m] > target)
                r = m - 1;          // go left
            else 
                l = m + 1;          // go right
        }

        // ???? ????
        System.out.println("<<< l: " + l + " r: " + r);

        // **** return index to insert target ****
        return l;
    }


    /**
     * Test scaffold
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read nums int[] array ****
        int[] nums = Arrays.stream(br.readLine().trim().split(","))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        // **** read target ****
        int target = Integer.parseInt(br.readLine().trim());

        // **** close buffered reader ****
        br.close();

        // ???? ????
        System.out.println("main <<< nums: " + Arrays.toString(nums));
        System.out.println("main <<< target: " + target);

        // **** call function of interest and display returned output ****
        System.out.println("main <<< output: " + searchInsert0(nums, target));

        // **** call function of interest and display returned output ****
        System.out.println("main <<< output: " + searchInsert(nums, target));
    }
}