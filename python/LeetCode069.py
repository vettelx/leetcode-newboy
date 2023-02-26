class Solution:
    def mySqrt(self, x: int) -> int:
        low = 0
        high = x
        while low <= high:
            mid = low + (high - low) // 2
            tmp = mid * mid
            if tmp <= x and x < (mid + 1) * (mid + 1):
                return mid
            elif x < tmp:
                high = mid - 1
            else:
                low = mid + 1


if __name__ == "__main__":
    s = Solution()
    print(s.mySqrt(0))
