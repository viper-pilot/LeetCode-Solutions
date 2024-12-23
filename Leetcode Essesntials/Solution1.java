public class Solution1 {
    // Merge method to merge two sorted arrays in place
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointer for the last valid index in nums1
        int i = m - 1;
        // Pointer for the last index of nums2
        int j = n - 1;
        // Pointer for the last index of nums1's full size (m + n)
        int k = m + n - 1;

        // Traverse both arrays from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                // Place nums1[i] in the correct position
                nums1[k--] = nums1[i--];
            } else {
                // Place nums2[j] in the correct position
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, place them in nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // No need to worry about leftover elements in nums1, as they are already in the correct place
    }

    // Main method to test the merge function
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        
        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        
        solution.merge(nums1, m, nums2, n);
        
        // Output the merged nums1
        System.out.println("Merged Array: " + java.util.Arrays.toString(nums1));
        
        // Example 2
        int[] nums1b = {1};
        int[] nums2b = {};
        m = 1; n = 0;
        
        solution.merge(nums1b, m, nums2b, n);
        
        // Output the merged nums1
        System.out.println("Merged Array: " + java.util.Arrays.toString(nums1b));
        
        // Example 3
        int[] nums1c = {0};
        int[] nums2c = {1};
        m = 0; n = 1;
        
        solution.merge(nums1c, m, nums2c, n);
        
        // Output the merged nums1
        System.out.println("Merged Array: " + java.util.Arrays.toString(nums1c));
    }
}
