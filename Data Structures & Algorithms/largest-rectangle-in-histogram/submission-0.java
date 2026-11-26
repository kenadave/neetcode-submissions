class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stck = new ArrayDeque<>();
        int maxA=0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
            int curH=(i==n)?0:heights[i];
            while(!stck.isEmpty() && curH<heights[stck.peek()]){
                int height=heights[stck.pop()];
                int width=stck.isEmpty()?i:i-stck.peek()-1;
                maxA=Math.max(maxA,height*width);
            }
            stck.push(i);
        }
        return maxA;
        
    }
}
