class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String keyStr = String.valueOf(charArr);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>()); 
            }
            map.get(keyStr).add(s);
        }
        
        return new ArrayList<>(map.values()); 
    }
}
