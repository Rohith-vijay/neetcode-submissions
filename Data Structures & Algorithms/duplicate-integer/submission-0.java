
class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Create a HashSet to keep track of numbers we have already processed
        HashSet<Integer> seen = new HashSet<>();
        
        // Loop through every number in the input array
        for (int num : nums) {
            // If the number is already in our set, it's a duplicate!
            if (seen.contains(num)) {
                return true;
            }
            // Otherwise, record this number in our set
            seen.add(num);
        }
        
        // If we checked all numbers and found no duplicates
        return false;
    }
}