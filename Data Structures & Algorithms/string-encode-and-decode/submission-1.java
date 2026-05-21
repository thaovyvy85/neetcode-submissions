
class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for(String str:strs) {
            result += str.length() + "#" + str;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0; 
        while (i<str.length()) {
            int index = str.indexOf("#",i);
            int length = Integer.parseInt(str.substring(i, index));
            result.add(str.substring(index+1, index+1+length));
            i= index+1+length;
        }
        return result;
    }
}
