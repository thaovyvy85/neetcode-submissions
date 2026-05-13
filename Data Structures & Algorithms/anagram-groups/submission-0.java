class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i=0; i<strs.length; i++) {
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);
            String sortedString = new String(array);
            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(strs[i]);
            } else {
                map.put(sortedString, new ArrayList<>());
                map.get(sortedString).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}
