class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(i<j){
            int curMin=Math.min(heights[j],heights[i]);
            maxArea=Math.max(maxArea,(j-i)*curMin);
            if(heights[j]>=heights[i]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}
