class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
        return false;
       }
       char[] sChars= s.toCharArray();
       Arrays.sort(sChars);
       String sortedS = new String(sChars);
       char[] tc=t.toCharArray();
       Arrays.sort(tc);
       String ts= new String(tc);
       if(sortedS.equals(ts)){
        return true;
       }
       else{
        return false;
       }
    }
}
    

