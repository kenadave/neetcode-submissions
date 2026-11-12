class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] chrs = new int[128];
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for(int i=0;i<sArr.length;i++){
            chrs[sArr[i]]++;
            chrs[tArr[i]]--;
        }
        for(int chr:chrs){
           if(chr!=0){
            return false;
           } 
        }
        return true;
    }
}
