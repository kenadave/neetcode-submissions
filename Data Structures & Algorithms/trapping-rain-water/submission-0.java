class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        int maxH = Integer.MIN_VALUE;
        int total=0;
        for(int i=0;i<n;i++){
            if(i==0){
                leftArr[i]=0;
            }else{
                maxH=Math.max(maxH,height[i-1]);
                leftArr[i]=maxH;
            }
        }
        maxH = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(i==(n-1)){
                rightArr[i]=0;
            }else{
                maxH=Math.max(maxH,height[i+1]);
                rightArr[i]=maxH;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(Math.min(rightArr[i],leftArr[i]));
        }
        for(int i=0;i<n;i++){
            int inSum=Math.min(rightArr[i],leftArr[i])-height[i];
            if(inSum<0){
                inSum=0;
            }
            total+=inSum;
        }
        return total;
    }
}
