class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] res = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int diff = target-nums[i];
            if(mp.containsKey(diff)){
                //res[0]=mp.get(diff);
                //res[1]=i;
                return new int[]{mp.get(diff),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
