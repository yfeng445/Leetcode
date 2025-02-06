class Solution(object):
    def numSubarrayProductLessThanK(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        lst = 0
        curr_lst = 0
        curr_product = 1
        left = 0
        for right in range(len(nums)):
            curr_product *= nums[right]  
            while curr_product >= k and left <= right:
                curr_product /= nums[left]
                left += 1
            lst += (right - left + 1) 

        return lst
        