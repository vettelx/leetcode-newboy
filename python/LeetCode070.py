class Solution:
    def climbStairs(self, n: int) -> int:
        prev = 1
        next = 1
        for i in range(n - 1):
            prev, next = next, prev + next
        return next
