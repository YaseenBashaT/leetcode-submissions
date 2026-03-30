class Solution {
    public static String sortStr(String str) {
        char[] charArray = str.toCharArray();
        int n = charArray.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        return new String(charArray);
    }

    public static boolean isAnagram(String s, String t) {
        return sortStr(s).equals(sortStr(t));
    }

}
