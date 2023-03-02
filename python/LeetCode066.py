from typing import List


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        i = len(digits)-1
        carry = 1
        result = [0]* len(digits)
        while i>=0 :
            sum = carry + digits[i]
            carry = sum // 10
            result[i] = sum % 10
            i-=1
        if carry > 0:
            result.insert(0,carry)
        return result
    
    def plusOne_(self, digits: List[int]) -> List[int]:           
        ''.join(digits)

if __name__ == '__main__':
    s = Solution()
    digits = [1,2,3]
    s = [str(x) for x in digits]
    s = ''.join(s)
    res = int(s)