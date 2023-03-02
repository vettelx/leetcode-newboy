class Solution:
    def romanToInt(self, s: str) -> int:
        transform_map = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000,
            "IV": 4,
            "IX": 9,
            "XL": 40,
            "XC": 90,
            "CD": 400,
            "CM": 900,
        }
        special_prefix = ['I','X','C']
        i = 0
        result = 0
        while i < len(s):
            if s[i] in special_prefix and i < len(s)-1: 
                roman_money = transform_map.get(s[i:i+2])
                if roman_money is not None:
                    result += roman_money
                    i+=1
                else:
                    result += transform_map.get(s[i])
            else:
                result += transform_map.get(s[i])
            i+=1
        return result
    
if __name__ == "__main__":
    s = Solution()
    result = s.romanToInt('MCMXCIV') 
    print(result)