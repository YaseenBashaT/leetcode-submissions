class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diff = 0
        for i in range(len(nums)):
            dif = target - nums[i]
            if nums.contains(diff):
                return (nums[i], diff)

        
        