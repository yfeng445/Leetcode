class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)<=2:
            return

        i = 0; j = i+2
        while(j != len(nums)):
            if nums[i] == nums[j]:
                while(nums[i] == nums[j]):
                    nums.pop(j)
                    if(j == len(nums)):
                        return
            i += 1
            j += 1      

        return
        
        

        