class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueValues = new HashSet<>();

        for(int num : nums){
            uniqueValues.add(num);
        }

        if(uniqueValues.size() < nums.length){
            return true;
        }

        return false;
    }
}