class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;
        int maxLength = 0;
        int i=0;
        for (int j=0; j<s.length(); j++) {
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            length = j - i + 1;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
