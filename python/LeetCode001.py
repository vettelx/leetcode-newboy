from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {}
        for i,num in enumerate(nums):
            remainder = target - num
            remainder_idx = dict.get(remainder)
            if remainder_idx is not None:
                return [i,remainder_idx]
            else:
                dict[num] = i 
    
    def twoSum2(self, nums: List[int], target: int) -> List[int]:
        dict = {nums[0]:0}
        nums = nums[1:]
        for i,num in enumerate(nums,1):
            remainder = target - num
            remainder_idx = dict.get(remainder)
            if remainder_idx is not None:
                return [remainder_idx,i]
            else:
                dict[num] = i


if __name__ == '__main__':
    s = Solution()
    print(s.twoSum2([2,7,11,15],9))
  
