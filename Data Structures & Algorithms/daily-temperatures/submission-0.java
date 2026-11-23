class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!dq.isEmpty() && temperatures[dq.peek()]<temperatures[i]){
                int prevIndex=dq.pop();
                res[prevIndex]=i-prevIndex;
            }
            dq.push(i);
        }
        return res;
    }
}
