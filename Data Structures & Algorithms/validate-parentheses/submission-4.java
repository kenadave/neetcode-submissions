class Solution {
    public boolean isValid(String s) {
        char[] chrArr = s.toCharArray();
        int len=chrArr.length;
        if(len%2!=0)
            return false;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<len;i++){
            if(chrArr[i]=='('){
                st.push(')');
            }else if(chrArr[i]=='{'){
                st.push('}');
            }else if(chrArr[i]=='['){
                st.push(']');
            }else if(st.isEmpty() || st.pop()!=chrArr[i]){
                return false;
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
}
