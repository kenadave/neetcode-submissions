class Solution {

    public String encode(List<String> strs) {
        if(strs==null || strs.size()==0 ){
            return new String("");
        }
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            if(str.equals("")){

            }
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
            //sb.append("#");
        }
    
        System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();
        if(str==null || str.length()==0 || str.equals(" ") || str.equals("")){
            return lst;
        }
        
        char[] strChars = str.toCharArray();
        int i=0;
        System.out.println("strChars.length:::"+strChars.length);
        while(i<strChars.length){
            int j=str.indexOf('#',i);
            int intNum = Integer.parseInt(str.substring(i,j));
            int start=j+1;
            int end=start+intNum;
            lst.add(str.substring(start,end));
            i=end;
        }
        return lst;
    }
}
