class Solution(object):
    def guessNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        mid = n
        guess_val = n
        while self.guess(guess_val) != 0:
            guess_val = guess_val + mid * self.guess(guess_val)
            mid = (mid + 1) // 2
        return guess_val
