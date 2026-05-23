class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int length = 1;
        int longest = 1;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                continue;
            }

            if (nums[i + 1] - nums[i] == 1) {
                length++;
            } else {
                length = 1;
            }

            if (length > longest) {
                longest = length;
            }
        }

        return longest;
    }
}