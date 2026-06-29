class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> sol= new HashMap<>();
        for(int num: nums){
            sol.put(num, sol.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(sol.entrySet());
        list.sort((a,b)-> b.getValue() - a.getValue());
        int[] result = new int[k];
        for(int i=0; i<k;i++){
            result[i]=list.get(i).getKey();
        }
        return result;
    }


}
