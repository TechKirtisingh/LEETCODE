class Solution {
    public int pivotIndex(int[] nums) 
    {
        // Wo index jiske: Left side ka sum = Right side ka sum  
//[1,7,3,6,5,6]
        int totalsum = 0;

        for(int num : nums)
        {
            totalsum = totalsum + num; // 28
        } 

        int leftsum =0;

        for(int i=0 ; i<nums.length ; i++)
        { // i=0 | 1 | 2 | 3
            int rightsum = totalsum - leftsum - nums[i];

            // rs=28-0-1=27 || 28-1-7=20 || 28-8-3 =17 || 28-11-6 =11

            if(leftsum == rightsum) // f | f | f | true
            {
                return i; // 6
            }

            leftsum = leftsum + nums[i];// ls=1 | 8 | 11
        }

        return -1;
    }
}