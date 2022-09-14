class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        tmp_dic = {nums[0]: 0}

        for i in range(1, len(nums)):
            tmp_idx = tmp_dic.get(target - nums[i])
            if tmp_idx is not None:
                return [tmp_idx, i]
            else:
                tmp_dic[nums[i]] = i


if __name__ == '__main__':
    sln = Solution()
    result = sln.twoSum([1, 2, 3, 4, 5], 5)
    print(result)
    mylist = [1, 2, 3, 4]
    print([mylist] * 3, [mylist * 3], mylist * 3)
