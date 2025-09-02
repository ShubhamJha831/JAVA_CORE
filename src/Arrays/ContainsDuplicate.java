package Arrays;

import java.util.*;

    public class ContainsDuplicate {
        public static boolean hasDuplicate(int[] nums) {
            HashSet<Integer> seen = new HashSet<>();
            for (int num : nums) {
                if (seen.contains(num)) {
                    return true; // duplicate found
                }
                seen.add(num);
            }
            return false; // all distinct
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2, 3, 1};
            System.out.println(hasDuplicate(nums1)); // true

            int[] nums2 = {1, 2, 3, 4};
            System.out.println(hasDuplicate(nums2)); // false

            int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
            System.out.println(hasDuplicate(nums3)); // true
        }

}
