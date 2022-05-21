class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0, b=0;
        for(; a<nums.length; a++) 
        {
            for(b=a+1; b<nums.length; b++)
            {
                if (nums[a] + nums[b] == target)
                {
                    int A[] = {a,b};
                    return A;
                }
            }
        }
        int B[] = {-1, -1};
        return B;
    }
}