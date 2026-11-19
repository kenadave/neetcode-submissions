class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int target=nums[i]*(-1);
            int j=i+1;
            int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1])continue;
            getPairs(nums,target,j,k,i,lst);
        }
        return lst; 
    }
    private void getPairs(int[] nums,int target,int j,int k,int i,List<List<Integer>> lst){
        while(j<k){
            if(nums[j]+nums[k]>target){
                k--;
            }else if(nums[j]+nums[k]<target){
                j++;
            }else{
                lst.add(Arrays.asList(nums[j],nums[k],nums[i]));
                j++;
                k--;
                while(j < k && nums[j]==nums[j-1])j++;
                while(j < k && nums[k]==nums[k+1])k--;
            }
        }
    }
}
