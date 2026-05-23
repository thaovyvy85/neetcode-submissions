class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            int curr = num;
            int streak = 0;
            while (set.contains(curr)) {
                curr++;
                streak++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}