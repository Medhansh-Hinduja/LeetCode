class Solution:
    def jump(self, nums: List[int]) -> int:
        n = len(nums) - 1
        m = len(nums)
        i = 0
        j = 0
        max_stop = -1
        stops = [0]
        if (m == 1):
            return 0
        while (i < m) :
            maximum = -1
            if (nums[i] >= n):
                break
            j = i + 1
            for j in range(i + nums[i] + 1) :
                if (((j - i) + nums[j]) >= maximum):
                    maximum = (j - i) + nums[j]
                    max_stop = j
            n -= (max_stop-i)        
            stops.append(max_stop)
            i = max_stop
        
        return len(stops)