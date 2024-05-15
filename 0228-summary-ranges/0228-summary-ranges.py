class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        start = end = 0
        result = []
        if (len(nums) == 0):
            return []
        for i in range(1, len(nums)):
            if (nums[i] == (nums[end]+1)):
                end += 1
            else:
                if (start == end):
                    result += [str(nums[start])]
                else:
                    r = str(nums[start]) + "->" + str(nums[end])
                    result += [r]
                start = end = i
        if (start == end):
            result += [str(nums[start])]
        else:
            r = str(nums[start]) + "->" + str(nums[end])
            result += [r]
        return result
