class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int n=prices.length;
        int res=0;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(!st.isEmpty()){
                if(st.peek()>prices[i]){
                    st.push(prices[i]);
                }else{
                    int diff=prices[i]-st.peek();
                    maxProfit=Math.max(maxProfit,diff);
                }
            }else{
                st.push(prices[i]);
            }
        }
        return maxProfit;
    }
}
