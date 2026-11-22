class Solution {
    public int evalRPN(String[] tokens) {
        /*Stack<String> st = new Stack<>();
        int res=0;
        for(int i=0;i<tokens.length;i++){
            String curToken = tokens[i];
            if(curToken.equals("*") || curToken.equals("+") ||
            curToken.equals("-") || curToken.equals("/")){
                int first=Integer.parseInt(st.pop().toString());
                int second=Integer.parseInt(st.pop().toString());
                if(curToken.equals("*")){
                    res=first*second;
                    st.push(String.valueOf(res));
                }else if(curToken.equals("/")){
                    res=second/first;
                    st.push(String.valueOf(res));
                }else if(curToken.equals("+")){
                    res=first+second;
                    st.push(String.valueOf(res));
                    System.out.println(res);
                }else if(curToken.equals("-")){
                    res=second-first;
                    st.push(String.valueOf(res));
                }
            }else{
                System.out.println(curToken);
                int curNum = Integer.parseInt(tokens[i]);
                st.push(tokens[i]);
            }
            
        }
        return res;*/
        Deque<Integer> st = new ArrayDeque<>();
        for(String token:tokens){
            switch(token){
                case "+" -> st.push(st.pop()+st.pop());
                case "*" -> st.push(st.pop()*st.pop());
                case "/" -> {
                    int first=st.pop();
                    int second=st.pop();
                    st.push(second/first);
                }
                case "-" -> {
                    int first=st.pop();
                    int second=st.pop();
                    st.push(second-first);
                }
                default -> st.push(Integer.parseInt(token));
            }

        }
        return st.pop();
    }
}
