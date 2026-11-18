class Solution {
    public boolean isPalindrome(String s) {
        char[] sch = s.toCharArray();
        int left=0;
        int right=sch.length-1;
        while(left<right){
            if(!Character.isLetterOrDigit(sch[left])){
                left++;
            } else if(!Character.isLetterOrDigit(sch[right])){
                right--;
            } else{
                if(Character.toLowerCase(sch[left])!=Character.toLowerCase(sch[right])){
                    return false;
                }
                 left++;
                 right--;
                
            }
           
        }
return true;
    }
}
