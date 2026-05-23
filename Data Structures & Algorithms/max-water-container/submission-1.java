class Solution {
    public int maxArea(int[] heights) {
        int[] pairs = new int[heights.length];
        int max = 0;
        for (int i = 0; i<heights.length; i++) {
            for (int j=i+1; j<heights.length; j++) {
                pairs[i] = Math.min(heights[i], heights[j]) * (j-i);
                max = Math.max(max, pairs[i]);
            }
        }
        return max;
    }
}