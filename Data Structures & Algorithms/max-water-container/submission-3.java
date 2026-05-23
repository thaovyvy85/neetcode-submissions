class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j=heights.length-1;
        int area = 0;
        int max = 0;
        while (i<j) {
            if (heights[i] < heights[j]) {
                area = heights[i] * (j-i);
                i++;
            }
            else if (heights[i] > heights[j]) {
                area = heights[j] * (j-i);
                j--;
            } else {
                area = heights[i] * (j-i);
                i++;
                j--;
            }
            max = Math.max(max, area);
        }
        return max;
    }
}