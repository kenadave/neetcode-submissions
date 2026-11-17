class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }   
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int longestStreak=1;
        int currentStreak=1;
        for(Integer num:st){
            if(!st.contains(num-1)){
                int currentNum=num;
                currentStreak=1;
                while(st.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
            }
            longestStreak=Math.max(longestStreak,currentStreak);
        }
        return longestStreak;
    }
}
