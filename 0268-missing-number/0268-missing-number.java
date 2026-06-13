class Solution 
{
    public int missingNumber(int[] nums) 
    {
        // 0---N => N(N+1)/2 ->GIVE ACTUAL SUM OF ARRAY   => ACTUAL_SUM - CURRENT_SUM = MISSING NUM
        // N=> actual range(how many no. are present)

                                              //  [4 , 5 , 1 , 2 , 0]

        int range = nums.length ; // =5

        int actual_sum = (range*(range+1))/2;   //N(N+1)/2   // = 5(6)/2 = 15  

            // actual sum when the missing number is present in array.

        int current_sum = 0;

        for(int i=0 ; i<nums.length ; i++)
        {
            current_sum = current_sum + nums[i];  // = 0+4=4 // 4+5=9 // 9+1=10 // 10+2=12 // 12+0 = 12
        }
        int missing_no = actual_sum - current_sum ;  // 15 - 12 =3
 
        return missing_no ; // 3
    }
}