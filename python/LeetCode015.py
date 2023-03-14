from typing import List
import itertools


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = set()
        n, z, p = [], [], []
        for num in nums:
            if num > 0:
                p.append(num)
            elif num < 0:
                n.append(num)
            else:
                z.append(num)

        N, P = set(n), set(p)

        # 1. (-a,0,a)
        if len(z) > 0:
            for num in P:
                if -1 * num in N:
                    res.add((-num, 0, num))

        # 2.(0,0,0)
        if len(z) >= 3:
            res.add((0, 0, 0))

        # 3. (-a,-b,a+b)
        for i in range(len(n)):
            for j in range(i + 1, len(n)):
                target = -(n[i] + n[j])
                if target in P:
                    res.add(tuple(sorted((n[i], n[j], target))))

        # 4. (-a-b,a,b)
        for i in range(len(p)):
            for j in range(i + 1, len(p)):
                target = -(p[i] + p[j])
                if target in N:
                    res.add(tuple(sorted((p[i], p[j], target))))

        return res


if __name__ == "__main__":
    nums = [-1, 0, 1, 2, -1, -4]
    solution = Solution()
    print(solution.threeSum(nums))
