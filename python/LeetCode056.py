from typing import List


class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if not intervals:
            return []
        intervals.sort(key=lambda row: row[0])
        res = [intervals[0]]
        for i in range(1, len(intervals)):
            interval = intervals[i]
            target = res[-1]
            if interval[0] <= target[1]:
                res[-1] = [target[0], max(interval[1], target[1])]
            else:
                res.append(interval)
        return res


if __name__ == "__main__":
    s = Solution()
    s.merge([[2, 6], [1, 3], [8, 10], [15, 18]])
