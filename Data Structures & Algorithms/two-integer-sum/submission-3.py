class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diff = 0
        pmap = {}
        for i, n in enumerate(nums):
            diff = target - n
            if diff in pmap:
                return [pmap[diff], i]
            pmap[n] = i

        
        