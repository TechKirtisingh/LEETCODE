class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int[] ans = new int[nums.length] ;

        // these are pointer

        int start = 0;
        int end = nums.length-1 ;  
        int ptr = ans.length - 1; 

        while(start<=end)
        {
            int start_sq = nums[start] * nums[start]; // square from start
            int end_sq = nums[end] * nums[end]; // square from end

            if(start_sq > end_sq)
            {
                ans[ptr] = start_sq ;
                start++;
            }
            else
            {
                ans[ptr] = end_sq ;
                end --;
            }

            ptr--;
        }

        return ans;

    }
}