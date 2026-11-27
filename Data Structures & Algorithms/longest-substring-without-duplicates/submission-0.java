class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int i=0;
        int j=0;
        int maxCount=0;
        char[] chr = s.toCharArray();
        int len=chr.length;
        while(j<len){
            if(st.contains(chr[j])){
                st.remove(chr[i]);
                i++;
            }else{
                st.add(chr[j]);
                maxCount=Math.max(maxCount,j-i+1);
                j++;
            }
            
        }
        return maxCount;
    }
}
