class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> seen = new HashMap<>();
        int [] arr = new int[2];

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(seen.containsKey(complement)){
                arr[0]=seen.get(complement);
                arr[1]=i;
                return arr;
            }
            seen.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
