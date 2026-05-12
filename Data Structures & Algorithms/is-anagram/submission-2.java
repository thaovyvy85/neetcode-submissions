class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> word1 = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char key = s.charAt(i);
            if(word1.containsKey(key)) {
                word1.put(key, word1.get(key) + 1);
            } else {
                word1.put(key, 1);
            }
        }
        for (int j=0; j<t.length(); j++) {
            char key = t.charAt(j);
            if(word1.containsKey(key)) {
                word1.put(key, word1.get(key) - 1);
            } else {
                return false;
            }
        }
        for (int value : word1.values()) {
            if (value !=0 )
                return false;
        }
        return true;
    }
}
