class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int i = 0;
        while (i < nums.length)
        {
            System.out.println(i);
            if (target > nums[i])
            {
                i = i + 1;
            }
            else if (target == nums[i])
            {
                return i;
            }
            else
            {
                return i;
            }

        }
        return nums.length;
    }
}
