from typing import List


class Solution:
    def hIndex(self, citations: List[int]) -> int:
        citations.sort(reverse=True)
        for i in range(len(citations)):
            if citations[i] <= (i + 1):
                return citations[i]
        return 1
