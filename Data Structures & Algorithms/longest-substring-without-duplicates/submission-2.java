class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        HashSet<Character> c=new HashSet<>();
        int left=0;
        int maxLen=0;
        for (int right = 0; right < n; right++) {
    while (c.contains(arr[right])) {
        c.remove(arr[left]);
        left++;
    }
        c.add(arr[right]);
        maxLen = Math.max(maxLen, right - left + 1);
}
    return maxLen;
    }
}
