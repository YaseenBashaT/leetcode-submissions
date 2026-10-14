class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        count1 = [0] * 26
        count = [0] * 26
        for i in range(len(s)):
            count[ord(s[i]) - ord('a')] += 1
            count1[ord(t[i]) - ord('a')] += 1
        if count == count1:
            return True
        return False
        