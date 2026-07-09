class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // 1. Sort the array to use two pointers and easily skip duplicates
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Two pointers for the remaining window
            int j = i + 1;
            int k = nums.length - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum == 0) {
                    // Correct syntax to add a triplet list
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    j++;
                    k--;
                    
                    // Skip duplicates for the second element
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    // Skip duplicates for the third element
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++; // Sum is too small, move left pointer rightward
                } else {
                    k--; // Sum is too large, move right pointer leftward
                }
            }
        }
        
        return result;
    }
}