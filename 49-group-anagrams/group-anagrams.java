class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> neu=new HashMap<>();
            for(String s:strs){
                char[] ch=s.toCharArray();
                Arrays.sort(ch);
                String sorted=new String(ch);
                if(!neu.containsKey(sorted)){
                    neu.put(sorted,new ArrayList<>());
                }
                
                    neu.get(sorted).add(s);
            
            }
  return new ArrayList<>(neu.values());  }
}