class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[k];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        //System.out.println(mp);
        List<Integer>[] lst = new List[n+1];
        for(Integer ky:mp.keySet()){
            int freq=mp.get(ky);
            if(lst[freq]==null){
                lst[freq]=new ArrayList<>();
            }
            lst[freq].add(ky);
        }
        for(int i=lst.length-1;i>0 && k>0;i--){
            if(null!=lst[i]){
                for(int j=0;j<lst[i].size();j++){
                    res[k-1]=lst[i].get(j);
                    k--;
                }
            }
        }
        return res;
    }
}
