from typing import List
import itertools


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # 3sum
        result = []

        result.sort()
        result = list(k for k, _ in itertools.groupby(result))
        return result


if __name__ == "__main__":
    nums = [-1, 0, 1, 2, -1, -4]
    solution = Solution()
    print(solution.threeSum(nums))
