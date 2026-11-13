class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        List<Integer>[] arr = new List[nums.length+1];
        for(Integer in:mp.keySet()){
            int freq=mp.get(in);
            if(arr[freq]==null){
                arr[freq]=new ArrayList<>();
            }
            arr[freq].add(in);
        }
        int[] res=new int[k];
        int counter=0;
        for(int i=arr.length-1;i>0;i--){
            List<Integer> resLst=arr[i];
            if(null!=resLst){
                for(int j=0;j<resLst.size() && counter<res.length;j++) {
                    System.out.println(resLst.size());
                    res[counter++]=resLst.get(j);
                }
            }
        }
        return res;
    }
}
