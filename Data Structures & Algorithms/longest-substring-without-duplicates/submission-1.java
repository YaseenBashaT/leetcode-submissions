class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int l = 0;
        int res = 0;
        HashSet<Character> set = new HashSet<>();

        for(int r=0;r<str.length;r++){
            while(set.contains(str[r])){
                set.remove(str[l]);
                l++;
            }
            set.add(str[r]);
            res = Math.max(res, r-l+1);
        }
        return res;

    }
}
