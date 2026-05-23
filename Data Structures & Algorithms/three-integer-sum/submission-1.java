class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length - 1; i++) {
            int k=i+1;
            int j=nums.length -1;
            while (k<j) {
                if (nums[i] + nums[j] + nums[k] > 0) {
                    j--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    k++;
                } else {
                    List<Integer> triplets = Arrays.asList(nums[i], nums[j], nums[k]);
                    set.add(triplets);
                    k++;
                    j--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
