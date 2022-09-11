class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        evenNum=0;
        for i in range(0, len(nums)):
            if len(str(nums[i])) % 2 == 0:
                evenNum +=1
        return evenNum;