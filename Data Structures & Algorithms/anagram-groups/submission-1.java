class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> mp = new HashMap<>();
        for(String str:strs){
            char[] count = new char[26];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }

            /*StringBuilder keybuilder = new StringBuilder();
            for(int i=0;i<26;i++){
                keybuilder.append("#");
                keybuilder.append(count[i]);
            }*/
            //String key = keybuilder.toString();
            String key = new String(count);
            //System.out.println(key);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(str);
            //lst.add(inLst);
        }
        return new ArrayList<>(mp.values());
    }
}
