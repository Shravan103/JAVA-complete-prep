public class _3_Traverse_array {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        System.out.println("Using Normal for loop: ");
        // Technique 1: (can modify the array)
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        
        System.out.println("Using for-each loop: ");
        // Technique 2: (cannot modify the array)
        for (int num : nums) {
            System.out.println(num);
        }
        
    }
}
