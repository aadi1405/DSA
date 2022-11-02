class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int j=1;
        for (int i = 0 ; i <nums.length-1 ; i++)
        {
            if (nums[i]!=nums[i+1])
            {
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }
}

/* 
so check every element with the next element and if it is not same then place the next element in the arr starting from index 1 */
