import re
class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        str = re.sub(r'[^A-Za-z0-9]', '', s).lower()
        for i in range(len(str)//2):
            if str[i] != str[-i-1]:
                return False
        return True
