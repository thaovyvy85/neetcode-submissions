class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int key = nums[i];
             if(map.containsKey(key)) {
                map.put(key, map.get(key)+1);
             }
             else {
                map.put(key, 1);
             }
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for (int i=0; i<bucket.length; i++) {
            bucket[i]= new ArrayList<>();
        }
        for (var entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            bucket[value].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for (int i=bucket.length-1; i>=0; i--) {
                for (int num: bucket[i]) {
                    result[index] = num;
                    index++;
                    if (index == k) {
                        return result;
                    }
                }
            }
        return result;  
    }
}
