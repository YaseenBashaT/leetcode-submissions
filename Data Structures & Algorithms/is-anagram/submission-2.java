
class Solution {
     public static String sortStr(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Assuming the input contains only lowercase English letters
        int[] count = new int[26];

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        // Build the sorted string based on the count array
        StringBuilder sortedBuilder = new StringBuilder(str.length());
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]; j++) {
                sortedBuilder.append((char) (i + 'a'));
            }
        }

        return sortedBuilder.toString();
    }

    public static boolean isAnagram(String s, String t) {
        return sortStr(s).equals(sortStr(t));
    }

}
