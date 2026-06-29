class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> sol=new HashMap<>();
        for(String s: strs){
            char[] ns= s.toCharArray();
            Arrays.sort(ns);
            String ss=new String(ns);
            sol.putIfAbsent(ss, new ArrayList<>());
            sol.get(ss).add(s);
        }
        return new ArrayList<>(sol.values());
    }
}
