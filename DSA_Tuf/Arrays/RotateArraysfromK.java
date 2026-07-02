public class RotateArraysfromK {
    /** Reverse elements in nums between start and end (inclusive). */
    private static void rev(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /** Rotate array to the right by k steps. Handles k >= 0 and empty arrays. */
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) return;
        int n = nums.length;
        k %= n;
        if (k < 0) k += n; // allow negative k to rotate left

        // Reverse whole array, then reverse first k and remaining n-k
        rev(nums, 0, n - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, n - 1);
    }

    // Optional small test helper
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        rotate(a, 3);
        for (int v : a) System.out.print(v + " ");
    }
}