class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> visitedNumbers = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int delta = target - nums[i];
            if(visitedNumbers.containsKey(delta)){
                return new int[] {i,visitedNumbers.get(delta)};
            }
            visitedNumbers.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}