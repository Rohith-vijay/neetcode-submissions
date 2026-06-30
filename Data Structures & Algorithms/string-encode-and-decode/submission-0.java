
class Solution {
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            // Use .append() for efficiency
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int j = i;
            // Find the delimiter
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Parse the length of the next string
            int length = Integer.parseInt(str.substring(i, j));
            
            // Extract the string and add to list
            String s = str.substring(j + 1, j + 1 + length);
            res.add(s);
            
            // Move pointer to the start of the next encoded block
            i = j + 1 + length;
        }
        return res;
    }
}