class Solution {
    public void rotate(int[] nums, int k) 
    {
        //[1,2,3,4,5,6,7]  k=3

        int n = nums.length; //n=7

        int[]  ans = new int[n];

        k=k % n ; // 3%7=3 || (if k=10 => 10%7=3) it means 10 rotation

        for(int i =0 ; i< n ; i++)
        {
            // put Current element ko uski new position par rakh do
            ans[(i + k) % n] = nums[i]; //ans[3] =1 | ans[4] =2

            //[ 5 , 6 , 7 , 1 , 2 , 3 ,4]
        }

        for (int i = 0; i < n; i++) {
            nums[i] = ans[i]; // copy it in nums[i]
        }
    }
}