class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(String li:strs){
           char[] arr= li.toCharArray();
           Arrays.sort(arr);
           String str= new String(arr);
           if(map.containsKey(str)){
            map.get(str).add(li);
           }
           else{
            List<String> list = new ArrayList<>();
            list.add(li);
            map.put(str, list);
           }
        }
        List<List<String>> ma = new ArrayList<>(map.values());
        return ma;
    }
}
