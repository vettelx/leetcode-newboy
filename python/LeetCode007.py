

class Solution:
    def reverse(self, x: int) -> int:
        symbol_flag = 1  # 1表示正数，-1表示负数
        if x < 0:
            x = -x
            symbol_flag = -1
        stack = []
        while x > 0:
            stack.append(x % 10)
            x = x // 10
        result = 0
        i = 0
        while len(stack) > 0:
            result += 10**i * stack.pop()
            i += 1
        if symbol_flag == -1:
            result = -result

        int32_max = (1 << 31) - 1
        int32_min = -(1 << 31)
        if result > int32_max or result < int32_min:
            result = 0
        return result
    
    def reverse2(self, x:int) -> int:
        sign = [1,-1][x<0]
        res = sign * int(str(abs(x))[::-1])
        return res if  -2**31 <= res <= (2**31)-1 else 0

if __name__ == "__main__":
    s = Solution()
    result = s.reverse2(1534236469)
    print(result > (2**31)-1)
    print(2**31,2**31-1)
