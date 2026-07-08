class Solution {
    public int searchInsert(int[] nums, int target) 
    {

// 10 20 30 40 50
// 0   1  2  3  4           target = 35 

        int start = 0;
        int end = nums.length -1;

        while(start<=end)
        {
            int mid=(start+end)/2; // 2 //3 //2

            if(nums[mid]==target) // 35>30 // 35<40
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                start = mid+1; //3 
            }
            else {
                end = mid-1; // 2
            }
        }

        return start;

    }
}