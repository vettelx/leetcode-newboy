from typing import List
import itertools


map = {
    "2": ["a", "b", "c"],
    "3": ["d", "e", "f"],
    "4": ["g", "h", "i"],
    "5": ["j", "k", "l"],
    "6": ["m", "n", "o"],
    "7": ["p", "q", "r", "s"],
    "8": ["t", "u", "v"],
    "9": ["w", "x", "y", "z"],
}

dic = {
    "2": "abc",
    "3": "def",
    "4": "ghi",
    "5": "jkl",
    "6": "mno",
    "7": "pqrs",
    "8": "tuv",
    "9": "wxyz",
}


class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if len(digits) == 0:
            return []
        all_list = []
        for c in digits:
            all_list.append(map.get(c))
        result = ["".join(p) for p in itertools.product(*all_list)]
        return result

    def method2(self, digits: str) -> List[str]:
        result = []
        if not digits:
            return result
        self.dfs(digits, 0, "", result)
        return result

    def dfs(self, digits, index, path, res):
        if index >= len(digits):
            res.append(path)
            return
        tmp = dic.get(digits[index])
        for c in tmp:
            self.dfs(digits, index + 1, path + c, res)


if __name__ == "__main__":
    s = Solution()
    print(s.method2("234"))
